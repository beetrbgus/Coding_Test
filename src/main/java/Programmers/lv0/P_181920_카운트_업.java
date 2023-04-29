package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181920">카운트 업</a>
 */
public class P_181920_카운트_업 {
    public static int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }

    public static void main(String[] args) {
        int start = 3;
        int end = 10;
        int[] resultArr = solution(start, end);

        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
