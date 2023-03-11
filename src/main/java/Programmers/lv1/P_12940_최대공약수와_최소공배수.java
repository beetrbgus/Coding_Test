package Programmers.lv1;

/**
 *  <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12940">최대공약수와 최소공배수</a>
 */
public class P_12940_최대공약수와_최소공배수 {
    /**
     * 최대공약수와 최소공배수를 반환하는 함수를 만들기.
     *  [0] = 최대공약수
     *  [1] = 최소공배수
     */
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        boolean isFirstBig = n >= m;
        int smallOne = isFirstBig ? m : n;
        int bigOne = isFirstBig ? n : m;
        answer[0] = gcd(bigOne, smallOne);
        answer[1] = bigOne * smallOne / answer[0];
        return answer;
    }

    /**
     * 유클리드 호제법을 이용한 최대 공약수를 구함.
     * a > b 일 때
     */
    public static int gcd(int bigOne, int smallOne) {
        if(smallOne == 0) return bigOne;
        return gcd(smallOne, bigOne % smallOne);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] result = solution(n, m);


        for (int resultComponent : result) {
            System.out.print(resultComponent + " ");
        }
        System.out.println();
        int n1 = 2;
        int m1 = 5;
        int[] result1 = solution(n1, m1);

        for (int resultComponent : result1) {
            System.out.print(resultComponent + " ");
        }
        System.out.println();
    }
}
