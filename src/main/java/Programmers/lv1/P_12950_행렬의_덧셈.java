package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12950">행렬의 덧셈</a>
 */
public class P_12950_행렬의_덧셈 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // arr1과 arr2의 i번째 더한 값이 answer[i] 번째가 됨
        // 마찬가지로 arr1[i][j]번째 더한 값이 answer[i][j] 가 됨
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] solution = solution(arr1, arr2);

        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                System.out.print(solution[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
