package Programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */
public class P_181878_원하는_문자열_찾기 {
    public static int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase())? 1 : 0;
    }
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        int result = solution(myString, pat);
        System.out.println(result);
    }
}
