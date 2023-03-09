package Programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */
public class P_120910_세균_증식 {
    public static int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        int result = solution(n, t);
        System.out.println(result);
    }
}
