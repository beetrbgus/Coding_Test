package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181884">n보다 커질 때까지 더하기</a>
 */
public class P_181884_N보다_커질_때까지_더하기 {
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) break;
        }
        return answer;
    }

    /**
     * stream reduce를 사용하면 Stream의 요소들을 하나의 데이터로 만드는 작업을 수행한다.
     *
     */
    public int streamSolution(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
    }
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int result = solution(numbers, n);
        System.out.println(result);
    }
}
