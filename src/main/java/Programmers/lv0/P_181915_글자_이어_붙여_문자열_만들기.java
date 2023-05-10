package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181915">글자 이어 붙여 문자열 만들기</a>
 */
public class P_181915_글자_이어_붙여_문자열_만들기 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int index : index_list) {
            sb.append(my_string.charAt(index));
        }
        return sb.toString();
    }

    public static String streamSolution(String my_string, int[] index_list) {
        return Arrays.stream(index_list)
                .mapToObj(index -> String.valueOf(my_string.charAt(index)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = streamSolution(my_string, index_list);
        System.out.println(result);
    }
}
