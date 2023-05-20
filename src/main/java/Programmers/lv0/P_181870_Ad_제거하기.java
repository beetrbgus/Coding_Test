package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181870">ad 제거하기</a>
 */
public class P_181870_Ad_제거하기 {
    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        String[] resultArr = solution(strArr);
        for (String result : resultArr) {
            System.out.println(result);
        }
    }
}
