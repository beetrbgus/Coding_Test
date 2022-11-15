package com.programmers.codingtest.lv0;

/**
 * 정수 num1과 num2가 주어질 때
 * 두 수의 곱을 return
 */
public class P_120804_MultipleOfNumber {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        P_120804_MultipleOfNumber multipleOfNumber = new P_120804_MultipleOfNumber();
        int num1 = 2;
        int num2 = 3;
        int solution = multipleOfNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
