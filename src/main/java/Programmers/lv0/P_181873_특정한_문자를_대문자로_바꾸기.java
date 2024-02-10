package Programmers.lv0;


/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181873">특정한 문자를 대문자로 바꾸기</a>
 */
public class P_181873_특정한_문자를_대문자로_바꾸기 {
    public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        String result = solution(my_string, alp);
        System.out.println(result);
    }
}
