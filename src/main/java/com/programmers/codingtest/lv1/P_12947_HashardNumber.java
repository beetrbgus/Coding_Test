package com.programmers.codingtest.lv1;

/**
 * 하샤드 수
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고,
 * 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * x는 1이상 만 이하의 자연수
 */
public class P_12947_HashardNumber {

    public boolean solution(int x) {
        int digitCount = String.valueOf(x).length();
        int sumDigitOfX = 0;
        int xCopy = x;

        for (int i = 0; i < digitCount; i++) {
            sumDigitOfX = sumDigitOfX + (xCopy%10);
            xCopy = xCopy/10;
        }
        return x%sumDigitOfX==0;
    }

    /**
     * 좋아요 가장 많이 받은 다른사람의 풀이
     * int를 String으로 바꿨다가 다시 int로 바꾸면 cost가 많이들지 않을까하는 궁금증
     *
     */
    public boolean isHarshad(int num){

        String[] temp = String.valueOf(num).split("");

        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        if (num % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        P_12947_HashardNumber a = new P_12947_HashardNumber();
        System.out.println(a.solution(15));
    }
}
