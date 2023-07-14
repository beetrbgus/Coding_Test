package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181854">배열의 길이에 따라 다른 연산하기</a>
 */
public class P_181854_배열의_길이에_따라_다른_연산하기 {
    public static int[] solution(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            boolean isOdd = arr.length % 2 == 0;
            if(isOdd) {
                if(i % 2 == 1) arr[i] = arr[i] + n;
            }
            else {
                if(i % 2 == 0) arr[i] = arr[i] + n;
            }
        }
        return arr;

    }

    public static int[] streamSolution(int[] arr, int n) {
        return IntStream.range(0, arr.length)
            .map(i -> arr[i]
                + ( i % 2 == (arr.length % 2 == 0 ? 0 : 1)
                    ? n : 0 )
            )
            .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] resultArr = solution(arr, n);

        for (int result : resultArr) {
            System.out.print( result + " ");
        }
    }
}
