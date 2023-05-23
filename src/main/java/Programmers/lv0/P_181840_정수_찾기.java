package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181840">정수 찾기</a>
 */
public class P_181840_정수_찾기 {
    public static int solution(int[] num_list, int n) {
        return Arrays.stream(num_list)
                .filter(value -> value == n)
                .findFirst()
                .orElse(0) > 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        int result = solution(num_list, n);
        System.out.println(result);
    }
}
