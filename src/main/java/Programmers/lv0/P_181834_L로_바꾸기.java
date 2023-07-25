package Programmers.lv0;

import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181834">L로 만들기</a>
 */
public class P_181834_L로_바꾸기 {
    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < 'l') chars[i] = 'l';
            sb.append(chars[i]);
        }
        return sb.toString();
    }
    public static String streamSolution(String myString) {
        return myString.chars()
                .mapToObj(s -> Character.toString(s > 'l'? s : 'l'))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        String result = streamSolution(myString);
        System.out.println(result);
    }

}
