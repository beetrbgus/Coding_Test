package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120854">배열 원소의 길이</a>
 */
public class P_120854_배열_원소의_길이 {
    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(str -> str.length())
                .toArray();
    }
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        int[] resultArr = solution(strlist);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
