<<<<<<<< HEAD:src/main/java/Programmers/lv0/P_120802_PlusTwoNumber.java
package Programmers.lv0;
========
package codingtest.lv0;
>>>>>>>> origin/main:Programmer/src/main/java/codingtest/lv0/P_120802_PlusTwoNumber.java

/**
 * 정수 num1과 num2가 주어질 때,
 * num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 */
public class P_120802_PlusTwoNumber {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        P_120802_PlusTwoNumber plusTwoNumber = new P_120802_PlusTwoNumber();
        int num1 = 2;
        int num2 = 3;
        int solution = plusTwoNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
