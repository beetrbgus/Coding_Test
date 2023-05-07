package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181935">홀짝에 따라 다른 값 반환하기</a>
 */
public class P_181935_홀짝에_따라_다른_값_반환하기 {
    public static int solution(int n) {
        int numberCount = n % 2 == 0 ? n / 2 : n / 2 + 1;
        return n % 2 == 1?
                numberCount * (2 + (numberCount - 1) * 2) / 2 :
                IntStream.rangeClosed(2,n).filter(index -> index % 2 == 0)
                        .map(value -> value*value)
                        .sum();
    }
    public static void main(String[] args) {
        int n = 7;
        int result = solution(n);
        System.out.println(result);
    }
}
