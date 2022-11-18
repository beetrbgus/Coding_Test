package Programmers.lv0;

/**
 * 정수 num1과 num2가 주어질 때
 * 두 수의 나눈 몫을 return
 */
public class P_120805_DevideOfNumber {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        P_120805_DevideOfNumber devideOfNumber = new P_120805_DevideOfNumber();
        int num1 = 2;
        int num2 = 3;
        int solution = devideOfNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
