package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181862">세 개의 구분자</a>
 */
public class P_181862_세_개의_구분자 {
    public static String[] solution(String myStr) {
        String[] result = Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.equals(""))
                .toArray(String[]::new);
        return result.length == 0? new String[]{"EMPTY"} : result;

    }
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";
        String[] resultArr = solution(myStr);
        for (String result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
