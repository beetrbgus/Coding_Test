package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181847">0 떼기</a>
 */
public class P_181847_0_떼기 {
    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
    public static void main(String[] args) {
        String n_str = "854020";
        String result = solution(n_str);
        System.out.println(result);
    }
}
