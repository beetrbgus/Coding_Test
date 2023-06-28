package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181879">길이에 따른 연산</a>
 */
public class P_181879_길이에_따른_연산 {
    public static int solution(int[] num_list) {
        return num_list.length >= 11 ?
                Arrays.stream(num_list).sum()
                : Arrays.stream(num_list).reduce((left, right) -> left * right)
                .getAsInt();
    }
    public static void main(String[] args) {
        int[] num_list2 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list = {2, 3, 4, 5};
        int solution = solution(num_list);
        System.out.println(solution);

    }
}
