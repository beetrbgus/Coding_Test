package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181929">원소들의 곱과 합</a>
 */
public class P_181929_원소들의_곱과_합 {
    public static int solution(int[] num_list) {
        int multiple = 1;
        int sumPow = (int) Math.pow(Arrays.stream(num_list)
                .sum(), 2);
        for (int num : num_list) {
            multiple *= num;
        }
        return multiple > sumPow? 0 : 1;
    }
    public static int streamSolution(int[] num_list) {
        return (
                    Arrays.stream(num_list)
                        .reduce((acc, i) -> acc * i)
                        .getAsInt()
                    <
                    Math.pow(Arrays.stream(num_list).sum(), 2)
                ) ? 1 : 0;
    }
    public static void main(String[] args) {
        int[] num_list =  {3, 4, 5, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }
}
