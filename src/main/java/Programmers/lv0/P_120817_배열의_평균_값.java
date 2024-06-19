package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120817">배열의 평균 값</a>
 */
public class P_120817_배열의_평균_값 {
    /**
     * 정수 배열 numbers가 매개변수로 주어집니다.
     * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
     * @param numbers
     * @return
     */
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
