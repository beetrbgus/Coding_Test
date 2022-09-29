package com.programmers.codingtest.lv1;

/**
 * 어떤 정수들이 있습니다.
 * 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 *
 * absolutes의 길이는 1 이상 1,000 이하입니다.
 * absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
 * signs의 길이는 absolutes의 길이와 같습니다.
 * signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 */
public class P_76501_SumYinAndYang {
    /**
     * 조건문으로 참일 때 더하고 거짓일 때 빼는 방식
     */
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }

    /**
     * 좋아요 첫번째로 많은 코드
     * 깔끔한 것 같다. 숫자에 -1을 곱하는 것이 가장 알아보기 쉽고
     * 코드 라인도 줄이고 명확한 것 같다.
     */
    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
    public static void main(String[] args) {
        P_76501_SumYinAndYang removeMinimumNumber = new P_76501_SumYinAndYang();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        removeMinimumNumber.solution(absolutes, signs);
    }
}
