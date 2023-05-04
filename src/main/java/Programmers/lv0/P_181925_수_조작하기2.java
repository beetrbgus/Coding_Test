package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181925">수 조작하기 2</a>
 */
public class P_181925_수_조작하기2 {
    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(1, numLog.length)
                .forEach(index -> {
                    int gap = numLog[index - 1] - numLog[index];
                    if(gap == -1) sb.append("w");
                    else if (gap == 1) sb.append("s");
                    else if (gap == -10) sb.append("d");
                    else sb.append("a");
                });
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = solution(log);
        System.out.println(result);
    }
}
