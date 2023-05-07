package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181863">rny_string</a>
 */
public class P_181863_rny_string {
    public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
    public static void main(String[] args) {
        String rny_string = "masterpiece";
        String result = solution(rny_string);
        System.out.println(result);
    }
}
