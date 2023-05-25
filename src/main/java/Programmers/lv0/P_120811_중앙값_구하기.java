package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120811">중앙값 구하기</a>
 */
public class P_120811_중앙값_구하기 {
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2 + 1];
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        int result = solution(array);
        System.out.println(result);
    }
}
