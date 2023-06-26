package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181890">왼쪽 오른쪽</a>
 */
public class P_181890_왼쪽_오른쪽 {
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "l", "r"};
        StringBuilder sb = new StringBuilder();
        for (String result : solution(str_list)) {
            sb.append(result);
        }
        System.out.println(sb);
    }
}
