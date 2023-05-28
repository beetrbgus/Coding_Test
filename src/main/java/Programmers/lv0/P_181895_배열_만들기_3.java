package Programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181895">배열 만들기 3</a>
 */
public class P_181895_배열_만들기_3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        List<int[]> collect = Arrays.stream(intervals)
                .map(interval ->
                        Arrays.copyOfRange(arr, interval[0], interval[1] + 1)
                )
                .collect(Collectors.toList());
        return IntStream.concat(IntStream.of(collect.get(0)), IntStream.of(collect.get(1))).toArray();
    }

    /**
     * 프로그래머스 다른 답변.
     * 새로운 IntStream으로 반환해 하나씩 받은걸 배열로 반환하는 형식.
     */
    public int[] solution2(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt(ints ->
                    Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))
                )
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        int[] resultArr = solution(arr, intervals);
        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
