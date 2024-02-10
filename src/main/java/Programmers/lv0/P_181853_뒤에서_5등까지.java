package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181853">뒤에서 5등까지</a>
 */
public class P_181853_뒤에서_5등까지 {
    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted()
                .limit(5)
                .toArray();
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] resultArr = solution(num_list);
        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
