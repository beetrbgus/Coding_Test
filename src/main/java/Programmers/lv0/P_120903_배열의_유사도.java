package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120903">배열의 유사도</a>
 */
public class P_120903_배열의_유사도 {
    public static int solution(String[] s1, String[] s2) {
        return (int)Arrays.stream(s1)
                .filter(str ->
                        Arrays.stream(s2)
                            .filter(s -> s.equals(str))
                            .findAny()
                            .isPresent()
                ).count();
    }
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int result = solution(s1, s2);
        System.out.println(result);
    }
}
