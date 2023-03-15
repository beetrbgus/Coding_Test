package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120826">특정 문자 제거하기</a>
 */
public class P_120826_특정_문자_제거하기 {
    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(solution(my_string, letter));
    }
}
