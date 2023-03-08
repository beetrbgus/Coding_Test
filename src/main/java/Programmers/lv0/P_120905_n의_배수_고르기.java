package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120905">n의 배수 고르기</a>
 */
public class P_120905_n의_배수_고르기 {
    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(value -> value % n == 0)
                .toArray();
    }
    public static void main(String[] args) {
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};
        int[] streamSolution = solution(n, numlist);
        for (int i = 0; i < streamSolution.length; i++) {
            System.out.println(streamSolution[i]);
        }
    }
}
