package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181858">무작위로 K개의 수 뽑기</a>
 */
public class P_181858_무작위로_K개의_수_뽑기 {
    public static int[] solution(int[] arr, int k) {
        int[] array = Arrays.stream(arr)
                        .distinct()
                        .toArray();
        return array.length >= k ?
                IntStream.range(0, k)
                        .map(i -> array[i])
                        .toArray()
                :
                IntStream.range(0, k)
                        .map(i -> i < array.length ? array[i] : -1)
                        .toArray()
                ;
    }

    /**
     * stream 만으로 한 다른 사람의 결과
     * concat으로 distinct 한 결과와
     * k개 만큼 -1을 배열로 만든 것을 합쳐
     * k개 만큼만 가져오면
     * distinct한 배열의 길이가 짧으면 -1을 부족한 갯수만큼 가져온다
     */
    public static int[] streamSolution(int[] arr, int k) {
        return IntStream
                .concat(
                    Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)
                )
                .limit(k)
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        int[] resultArr = solution(arr, k);

        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
