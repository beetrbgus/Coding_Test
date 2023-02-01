package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120908">문자열안에 문자열</a>
 *
 */
public class P_120908_문자열안에_문자열 {
    public static int solution(String str1, String str2) {
        return str1.contains(str2)? 1 : 2;
    }

    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int result = solution(str1, str2);
        System.out.println(result);
    }
}
