package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/389478">택배 상자 꺼내기</a>
 */
public class P_389478_택배_상자_꺼내기 {

    public static int solution(int n, int w, int num) {
        // 2차원 배열에 창고의 상자 배치하기
        int height = (int) Math.ceil((double) n / w);
        int[][] warehouse = new int[height][w];
        int boxNumber = 1;

        for (int i = 0; i < height; i++) {
            // 왼쪽 → 오른쪽
            if (i % 2 == 0) {
                for (int j = 0; j < w && boxNumber <= n; j++) {
                    warehouse[i][j] = boxNumber++;
                }
            } else {
                // 오른쪽 → 왼쪽
                for (int j = w - 1; j >= 0 && boxNumber <= n; j--) {
                    warehouse[i][j] = boxNumber++;
                }
            }
        }

        int row = -1;
        int column = -1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w; j++) {
                if (warehouse[i][j] == num) {
                    row = i;
                    column = j;
                    break;
                }
            }
            if (row != -1) break;
        }

        int count = 0;
        for (int i = row; i < height; i++) {
            if (warehouse[i][column] != 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 22;
        int w = 6;
        int num = 8;

        // 2n        n+5     n+4     n+3     n+2  n+1
        // n-(w-1) n-(w-2) n-(w-3) n-(w-4) n-(w-5) n
        int result = solution(n, w, num);

        System.out.println(result);
    }
}
