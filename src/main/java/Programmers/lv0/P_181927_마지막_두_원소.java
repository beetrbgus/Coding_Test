package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181927">마지막 두 원소</a>
 */
public class P_181927_마지막_두_원소 {
    public static int[] solution(int[] num_list) {
        int[] answer = IntStream.rangeClosed(0, num_list.length)
                .map(i -> i < num_list.length ? num_list[i] : 0)
                .toArray();
        answer[num_list.length] = answer[num_list.length - 1 ] > answer[num_list.length - 2]
                ? answer[num_list.length - 1] - answer[num_list.length - 2] : answer[num_list.length - 1] * 2;
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int[] resultArr = solution(num_list);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
