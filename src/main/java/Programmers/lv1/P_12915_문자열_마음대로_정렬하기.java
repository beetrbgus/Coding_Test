package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 미완
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12915">문자열 내 마음대로 정렬하기</a>
 */
public class P_12915_문자열_마음대로_정렬하기 {
    /**
     * 문자열 비교 + 정렬
     */
    public static String[] solution(String[] strings, int n) {
        String[] answer;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 2;
        System.out.println(solution(strings, n));
    }
}
