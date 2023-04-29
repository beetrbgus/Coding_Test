package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181831">특별한 이차원 배열 2</a>
 */
public class P_181831_특별한_이차원_배열2 {
    public static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // 같지 않으면 더 진행할 필요가 없음.
                if(arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33},{192, 72, 95},{33, 95, 999}};
        int result = solution(arr);
        System.out.println(result);
    }
}
