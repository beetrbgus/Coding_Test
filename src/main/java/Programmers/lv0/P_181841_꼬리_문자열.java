package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181841">꼬리 문자열</a>
 */
public class P_181841_꼬리_문자열 {
    public static String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        String result = solution(str_list, ex);
        System.out.println(result);
    }
}
