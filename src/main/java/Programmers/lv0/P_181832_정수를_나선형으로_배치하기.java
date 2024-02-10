package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181832">정수를 나선형으로 배치하기</a>
 */
public class P_181832_정수를_나선형으로_배치하기 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row = 0;
        int column = 0;
        int direction = 0;
        for (int i = 1; i <= n * n; i++) {
            answer[row][column] = i;

            if(direction % 4 == 0) {
                if(column == n - 1 || answer[row][column + 1] != 0) {
                    direction++;
                    row++;
                }
                else column++;
            }else if (direction % 4 == 1) {
                if(row == n - 1 || answer[row + 1][column] != 0) {
                    direction++;
                    column--;
                }
                else row++;
            } else if (direction % 4 == 2) {
                if(column == 0 || answer[row][column - 1] != 0) {
                    direction++;
                    row--;
                }
                else column--;
            }else {
                if(row == 0 || answer[row - 1][column] != 0) {
                    direction++;
                    column++;
                }
                else row--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] resultDoubleArr = solution(n);
        for (int i = 0; i < resultDoubleArr.length; i++) {
            int[] resultArr = resultDoubleArr[i];
            for (int j = 0; j < resultArr.length; j++) {
                System.out.print(resultArr[j] + " ");
            }
            System.out.println();
        }
    }
}
