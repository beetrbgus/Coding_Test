package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120821">배열 뒤집기</a>
 * 스트림 연습하기
 */
public class P_120821_배열_뒤집기 {
    public static int[] solution(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .map(index -> num_list[num_list.length - 1 - index]).toArray();
    }
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);
        for (int resultIndex : result) {
            System.out.println(resultIndex);
        }
    }
}
