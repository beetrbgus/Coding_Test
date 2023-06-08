package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181941">문자 리스트를 문자열로 변환하기</a>
 */
public class P_181941_문자_리스트를_문자열로_변환하기 {
    public static String solution(String[] arr) {
        return Arrays.stream(arr)
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        String result = solution(arr);
        System.out.println(result);
    }
}
