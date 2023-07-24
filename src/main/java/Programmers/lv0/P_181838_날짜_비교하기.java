package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181838">날짜 비교하기</a>
 */
public class P_181838_날짜_비교하기 {
    public static int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if(date1[i] < date2[i]) {
                return 1;
            } else if (date1[i] > date2[i]) {
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int result = solution(date1, date2);
        System.out.println(result);
    }
}
