package com.programmers.codingtest.lv1;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다
 *  n은 100억 이하 자연수
 */
public class P_12932_MakeReverseArr {

    public int[] solution(long n) {
        int nDigit = String.valueOf(n).length();
        int[] answer = new int[nDigit];

        for (int i = 0; i < nDigit; i++) {
            int number = (int) (n % 10);
            answer[i] = number;
            n = n/10;
        }
        return answer;
    }

    /**
     * 좋아요가 가장 많은 다른 사람의 풀이
     * while을 내가 for로 쓴 것을 제외하고는 비슷하다.
     * @param n
     * @return
     */
    public int[] solution2(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12932_MakeReverseArr a = new P_12932_MakeReverseArr();
        System.out.println(a.solution(12345));
    }
}
