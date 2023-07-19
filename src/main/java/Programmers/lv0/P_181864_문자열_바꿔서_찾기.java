package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181864">문자열 바꿔서 찾기</a>
 */
public class P_181864_문자열_바꿔서_찾기 {
    public static int solution(String myString, String pat) {
        return  Arrays.asList(myString.split(""))
                .stream()
                .map(s -> s.equals("A") ? "B" : "A")
                .collect(Collectors.joining())
                .contains(pat) ? 1 : 0;
    }
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        int result = solution(myString, pat);
        System.out.println(result);
    }
}
