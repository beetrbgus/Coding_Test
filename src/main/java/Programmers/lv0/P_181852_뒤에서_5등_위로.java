package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181852">뒤에서 5등 위로</a>
 */
public class P_181852_뒤에서_5등_위로 {
    public static int[] solution(int[] num_list) {
        return Arrays.copyOfRange(
                Arrays.stream(num_list).sorted().toArray()
                , 5
                , num_list.length);
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] resultArr = solution(num_list);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
