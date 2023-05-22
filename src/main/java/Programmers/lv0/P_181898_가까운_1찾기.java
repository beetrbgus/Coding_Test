package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181898">가까운 1 찾기</a>
 */
public class P_181898_가까운_1찾기 {
    public static int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                .filter(index -> arr[index] == 1)
                .findFirst()
                .orElse(-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 0};
        int idx = 4;
        int result = solution(arr, idx);
        System.out.println(result);
    }
}
