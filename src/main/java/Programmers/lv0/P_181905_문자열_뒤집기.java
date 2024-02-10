package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181905">문자열 뒤집기</a>
 */
public class P_181905_문자열_뒤집기 {
    public static String solution(String my_string, int s, int e) {
        String substring = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder(substring);
        sb = sb.reverse();

        return my_string.replace(substring, sb.toString());
    }
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String result = solution(my_string, s, e);
        System.out.println(result);
    }
}
