package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181940">문자열 곱하기</a>
 */
public class P_181940_문자열_곱하기 {
    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;
        String result = solution(my_string, k);
        System.out.println(result);
    }
}
