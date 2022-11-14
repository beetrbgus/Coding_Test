package com.programmers.codingtest.lv0;

/**
 * 정수 num1과 num2가 매개변수로 주어질 때,
 * num1과 num2가 같다면 1, 다르다면 -1을
 * return 하도록 soltuion 함수를 완성해주세요.
 */
public class P_120807_CompareTwoNumber {
    public int solution(int num1, int num2) {
        return (num1 == num2)? 1 : -1;
    }

    public static void main(String[] args) {
        P_120807_CompareTwoNumber compareTwoNumber = new P_120807_CompareTwoNumber();
        int num1 = 2;
        int num2 = 3;
        int solution = compareTwoNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
