package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120808">분수의 덧셈</a>
 */
public class P_120808_분수의_덧셈 {
    /**
     * 최소 공배수를 구한 다음
     */
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for(int i = numerator-1; i > 1; i--) {
            // 기약분수로 만듦
            if(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        return new int[]{ numerator, denominator };
    }
    public static void main(String[] args) {
        int number1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
    }
}
