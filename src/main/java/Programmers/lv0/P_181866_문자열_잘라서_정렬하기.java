package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181866">문자열 잘라서 정렬하기</a>
 */
public class P_181866_문자열_잘라서_정렬하기 {
    public static String[] solution(String myString) {
        return Arrays.asList(myString.split("x"))
                .stream()
                .filter(s -> !s.equals(""))
                .sorted()
                .toArray(String[]::new);
    }
    public static void main(String[] args) {
        String myString = "axbxcxdx";
        String[] resultArr = solution(myString);
        for (String result : resultArr) {
            System.out.println(result);
        }
    }
}
