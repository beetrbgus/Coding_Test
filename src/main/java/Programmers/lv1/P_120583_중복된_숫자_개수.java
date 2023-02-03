package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120583">중복된 숫자 개수</a>
 *
 */
public class P_120583_중복된_숫자_개수 {
    // 배열 안에 n이 몇개 있는지 출력
    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) answer ++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int result = solution(array, n);
        System.out.println(result);
    }
}
