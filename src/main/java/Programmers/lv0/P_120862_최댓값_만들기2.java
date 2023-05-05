package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120862">최댓값 만들기 (2)</a>
 */
public class P_120862_최댓값_만들기2 {
    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int dup = Integer.MIN_VALUE;
        if(numbers[1] < 0) dup = numbers[0] * numbers[1];
        int maxNumberDup = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return dup > maxNumberDup ? dup : maxNumberDup;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        int result = solution(numbers);
        System.out.println(result);
    }
}
