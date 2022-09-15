package com.programmers.codingtest.lv1;

/**
 *  어떤 제곱근인지 판단해서 맞으면
 *  제곱근+1의 제곱을 구하기
 */
public class P_12934_IsSquart {
    public long solution(long n) {
        double numSqrt = Math.sqrt((double)n);
        return (numSqrt % 1 == 0) ? (long) Math.pow(numSqrt+1,2) : -1L;
    }

    /**
     * 다른 사람의 풀이 방법
     * 로직적으로 큰 차이는 없지만 이 답안이
     * 알아보기 편하게 작성된 것 같다.
     */
    public long solution2(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
    public static void main(String[] args) {
        P_12934_IsSquart a = new P_12934_IsSquart();
        int arr =  121;
        System.out.println(a.solution(arr));
    }
}
