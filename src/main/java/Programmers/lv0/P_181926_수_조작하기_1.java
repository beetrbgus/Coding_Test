package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */
public class P_181926_수_조작하기_1 {
    public static int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++) {
            char element = control.charAt(i);
            if(element == 'w') n += 1;
            else if(element == 's') n -= 1;
            else if(element == 'd') n += 10;
            else if(element == 'a') n -= 10;
            else {}
        }
        return n;
    }
    public int streamSolution(int n, String control) {
        return control.chars()
                .reduce(n, (acc, c) ->
                    acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10)
                );
    }
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        int result = solution(n, control);
        System.out.println(result);
    }
}
