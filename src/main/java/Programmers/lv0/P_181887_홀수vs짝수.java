package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181887">홀수 vs 짝수</a>
 */
public class P_181887_홀수vs짝수 {
    public static int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < num_list.length;i++) {
            if(i % 2 == 1) oddSum += num_list[i];
            else evenSum += num_list[i];
        }
        return evenSum > oddSum ? evenSum : oddSum;
    }

    /**
     * Stream 사용
     */
    public static int streamSolution(int[] num_list) {
        int odd = IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                .map(index -> num_list[index])
                .sum();
        int even = IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                .map(index -> num_list[index])
                .sum();
        return Integer.max(odd, even);
    }
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int result1 = streamSolution(num_list);
        int result2 = solution(num_list);
        System.out.println(result1);
        System.out.println(result2);
    }
}
