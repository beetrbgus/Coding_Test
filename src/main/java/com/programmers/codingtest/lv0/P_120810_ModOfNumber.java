package com.programmers.codingtest.lv0;

/**
 * 정수 num1과 num2가 주어질 때,
 * num1에서 num2의 나머지의 값을 return하도록 soltuion 함수를 완성해주세요.
 */
public class P_120810_ModOfNumber {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        P_120810_ModOfNumber modOfNumber = new P_120810_ModOfNumber();
        int num1 = 2;
        int num2 = 3;
        int solution = modOfNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
