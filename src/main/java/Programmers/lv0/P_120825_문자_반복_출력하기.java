package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120825">문자 반복 출력하기</a>
 */
public class P_120825_문자_반복_출력하기 {
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String result = solution(my_string, n);
        System.out.println(result);
    }
}
