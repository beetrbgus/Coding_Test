package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120585">머쓱이보다 키 큰 사람</a>
 */
public class P_120585_머쓱이보다_키_큰_사람 {
    public static int solution(int[] array, int height) {
        return IntStream.range(0, array.length)
                .filter(index -> array[index] > height)
                .toArray().length;
    }
    public static void main(String[] args) {
        int[] arr = {149, 180, 192, 170};
        int height = 167;
        int result = solution(arr, height);
        System.out.println(result);
    }
}
