package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181838">날짜 비교하기</a>
 */
public class P_181838_날짜_비교하기 {
    public static int solution(int[] date1, int[] date2) {
        return IntStream.range(0, date1.length)
                .filter(i -> date1[i] > date2[i])
                .findFirst()
                .orElse(0) != 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int result = solution(date1, date2);
        System.out.println(result);
    }
}
