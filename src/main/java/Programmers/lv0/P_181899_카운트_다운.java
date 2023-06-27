package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181899">카운트 다운</a>
 */
public class P_181899_카운트_다운 {
    public static int[] solution(int start, int end) {
        return IntStream.range(0, start - end + 1)
                .map(i ->  start - i)
                .toArray();
    }
    public static void main(String[] args) {
        int start = 10;
        int end = 3;
        int[] resultArr = solution(start, end);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
