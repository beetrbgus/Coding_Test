package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181892">n 번째 원소부터</a>
 */
public class P_181892_N번째_원소부터 {
    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(n-1, num_list.length)
                .map(index -> num_list[index])
                .toArray();
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;
        int[] resultArr = solution(num_list, n);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
