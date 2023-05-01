package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181896">첫 번째로 나오는 음수</a>
 */
public class P_181896_첫_번째로_나오는_음수 {
    public static int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) return i;
        }
        return -1;
    }

    /**
     * 스트림으로 풀어보기
     */
    public static int streamSolution(int[] num_list) {
        final int LENGTH = num_list.length;
        return IntStream.range(0, LENGTH)
                .filter(index -> num_list[index] < 0)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int result = solution(num_list);
        int streamSolution = streamSolution(num_list);
        System.out.println(result);
        System.out.println(streamSolution);
    }
}
