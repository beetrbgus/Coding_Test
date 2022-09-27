package com.programmers.codingtest.lv1;

public class P_12922_WaterMelon {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String nowWord = (i%2==1)?"수" : "박";
            answer.append(nowWord);
        }
        return answer.toString();
    }

    /**
     * 좋아요가 2번째로 많은 문제풀이 ( 첫번째는...노가다성)
     * n이 n이면 n글자가 순서대로 들어와야한다.
     * 이 분은 n이 1-2면 수박, n이 3-4면 수박수박 ...
     * n이 n이면 수박 * n/2만큼 출력한 다음
     * substring으로 잘라내서 주고 싶기 때문에
     * 홀수일 때 0.5 처럼 잘리는 숫자를 방지하기 위해
     * n/2 + 1 로 나눈 숫자를 범위에 맞게 조정하고 싶었던 것 같다.
     */
    public String watermelon(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
    public static void main(String[] args) {
        P_12922_WaterMelon waterMelon = new P_12922_WaterMelon();
        int n = 3;
        waterMelon.solution(n);
        waterMelon.watermelon(3);
    }
}
