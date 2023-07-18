package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181856">배열 비교하기</a>
 */
public class P_181856_배열_비교하기 {
    public static int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }
        int arr1Sum = Arrays.stream(arr1).sum();
        int arr2Sum = Arrays.stream(arr2).sum();
        if(arr1Sum == arr2Sum) return 0;
        return arr1Sum > arr2Sum ? 1 : -1;
    }

    /**
     * 다른 사람의 풀이
     * compare를 통해서 코드 길이를 짧게 함
     */
    public int streamSolution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        int result1 = solution(arr1, arr2);

        int[] arr3 = {100, 17, 84, 1};
        int[] arr4 = {55, 12, 65, 36};
        int result2 = solution(arr3, arr4);

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = {3, 3, 3, 3, 3};
        int result3 = solution(arr6, arr6);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
