package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181882">조건에 맞게 수열 변환하기 1</a>
 */
public class P_181882_조건에_맞게_수열_변환하기1 {
    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(value -> {
                    boolean isEven = value % 2 == 0;
                    if(value >= 50 && isEven) return value/2;
                    else if (50 > value && !isEven) return value * 2;
                    else return value;
                })
                .toArray();
    }
    public static int[] solution2(int[] arr) {
        return Arrays.stream(arr)
                .map(value ->
                    value >= 50 && value % 2 == 0 ?
                        value/2 : 50 > value && value % 2 == 1 ?
                    value * 2 : 0
                )
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] resultArr = solution(arr);
        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
