package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120836">순서쌍의 개수</a>
 */
public class P_120836_순서쌍의_개수 {
    public static int solution(int n) {
        return (int)IntStream.rangeClosed(1, (int) Math.sqrt(n))
                .filter(operand -> n % operand == 0)
                .count() * 2 - (Math.sqrt(n) % 1 == 0? 1 : 0);
    }
    public static void main(String[] args) {
        int n = 20;
        int result = solution(n);
        System.out.println(result);
    }
}
