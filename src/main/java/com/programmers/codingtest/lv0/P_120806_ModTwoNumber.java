package com.programmers.codingtest.lv0;

/**
 * 정수 num1과 num2가 매개변수로 주어질 때,
 * num1을 num2로 나눈 값에 1,000을 곱한 후
 * 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
public class P_120806_ModTwoNumber {
    public int solution(int num1, int num2) {
        double devide = (double) num1 / num2;
        return (int) (devide * 1000);
    }

    public static void main(String[] args) {
        P_120806_ModTwoNumber modTwoNumber = new P_120806_ModTwoNumber();
        int num1 = 3;
        int num2 = 2;
        int solution = modTwoNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
