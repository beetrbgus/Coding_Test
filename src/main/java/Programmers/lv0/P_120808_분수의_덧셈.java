package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120808">분수의 덧셈</a>
 */
public class P_120808_분수의_덧셈 {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = getGCD(denom1, denom2);
        int lcm = getLCM(denom1, denom2, gcd);

        int numerator1 = (lcm / denom1) * numer1;
        int numerator2 = (lcm / denom2) * numer2;
        int resultNumerator = numerator1 + numerator2;

        // 결과를 기약분수로 변환
        int resultGCD = getGCD(resultNumerator, lcm);
        return new int[]{resultNumerator / resultGCD, lcm / resultGCD};
    }

    // 최대공약수 (유클리드 호제법)
    public static int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }

    // 최소공배수
    public static int getLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }

    public static void main(String[] args) {
        int[] solution = solution(2, 4, 2, 4);
        int[] solution2 = solution(996, 997, 3, 997);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
            System.out.println(solution2[i]);
        }
    }
}
