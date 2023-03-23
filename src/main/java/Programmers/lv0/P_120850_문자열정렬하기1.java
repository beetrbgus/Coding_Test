package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120850">문자열 정렬하기 (1)</a>
 */
public class P_120850_문자열정렬하기1 {
    public static int[] solution(String my_string) {

        int numberCount = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char myStringChar = my_string.charAt(i);
            if(myStringChar >= '0' && myStringChar <= '9') {
                numberCount++;
            }
        }
        int[] answer = new int[numberCount];
        int answerCount = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char myStringChar = my_string.charAt(i);
            if(myStringChar >= '0' && myStringChar <= '9') {
                answer[answerCount] = myStringChar - '0';
                answerCount++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        String my_String = "hi12392";
        int[] result = solution(my_String);
        for (int resultIndex : result) {
            System.out.println(resultIndex);
        }
    }
}
