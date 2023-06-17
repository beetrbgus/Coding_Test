package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181833?language=java">특별한 이차원 배열 1</a>
 */
public class P_181833_특별_이차원_배열_1 {
    public static int[][] solution(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n)
                        .map(j -> i == j ? 1 : 0)
                        .toArray()
                )
                .toArray(int[][]::new);
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] resultArrs = solution(n);
        for (int[] results : resultArrs) {
            for (int result : results) {
                System.out.print(result + ", ");
            }
            System.out.println();
        }
    }
}
