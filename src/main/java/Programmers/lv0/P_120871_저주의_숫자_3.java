package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120871">저주의 숫자 3</a>
 */
public class P_120871_저주의_숫자_3 {
    public static int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 15;
        int result = solution(n);
        System.out.println(result);
    }
}
