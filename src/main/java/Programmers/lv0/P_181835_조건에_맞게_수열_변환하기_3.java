package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181835">조건에 맞게 수열 변환하기 3</a>
 */
public class P_181835_조건에_맞게_수열_변환하기_3 {
    public static int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(element -> k%2==0? element + k : element * k)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        int[] resultArr = solution(arr, k);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
