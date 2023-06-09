package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181904">세로 읽기</a>
 */
public class P_181904_세로_읽기 {
    public static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        char[] myStringCharArr = my_string.toCharArray();
        for (int i = c - 1; i < myStringCharArr.length; i+=m) {
            answer.append(myStringCharArr[i]);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        String result = solution(my_string, m, c);
        System.out.println(result);
    }
}
