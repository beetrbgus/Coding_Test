package Programmers.lv0;

import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120834">외계행성의 나이</a>
 */
public class P_120834_외계행성의_나이 {
    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();
        do {
            int end = age % 10;
            answer.append((char)('a' + end));
            age /= 10;
        }while (age > 0);
        return answer.reverse().toString();
    }

    /**
     * stream 이용한 답안.
     */
    public static String streamSolution(int age) {
        int gap = 'a' - '0';
        return String.valueOf(age).chars()
                .mapToObj(operand -> String.valueOf((char) (gap + operand)))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        int age = 23;
        String result = solution(age);
        System.out.println(result);
        System.out.println(streamSolution(age));
    }
}
