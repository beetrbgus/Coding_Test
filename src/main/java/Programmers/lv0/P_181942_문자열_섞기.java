package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class P_181942_문자열_섞기 {
    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str1.length())
                .forEach(index -> {
                    sb.append(str1.charAt(index));
                    sb.append(str2.charAt(index));
                });
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String result = solution(str1, str2);
        System.out.println(result);
    }
}
