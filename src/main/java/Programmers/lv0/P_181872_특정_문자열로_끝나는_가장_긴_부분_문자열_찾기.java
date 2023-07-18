package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181872">특정 문자열로 끝나는 가장 긴 부분 문자열 찾기</a>
 */
public class P_181872_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public static String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";
        String result = solution(myString, pat);
        System.out.println(result);
    }
}
