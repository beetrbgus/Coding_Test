package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120815">피자 나눠 먹기 (2)</a>
 */
public class P_120815_피자_나눠_먹기_2 {
    public static int solution(int n) {
        for (int i = 1; i <= 6 * n; i++) {
            if( 6 * i % n == 0) return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 6;
        int result = solution(n);
    }
}
