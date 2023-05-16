package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181889">n 번째 원소까지</a>
 */
public class P_181889_N번째_원소까지 {
    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0, n)
                .map(index ->
                        num_list[index]
                ).toArray();
    }
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};
        int n = 3;
        int[] result = solution(num_list, n);
        for (int s : result) {
            System.out.println(s);
        }
    }
}
