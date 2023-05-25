package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120833">배열 자르기</a>
 */
public class P_120833_배열_자르기 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2)
                .map(operand -> numbers[operand])
                .toArray();
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int[] resultArr = solution(numbers, num1, num2);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
