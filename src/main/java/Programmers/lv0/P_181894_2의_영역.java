package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181894">2의 영역</a>
 */
public class P_181894_2의_영역 {
    public static int[] solution(int[] arr) {
        int[] indexs = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if(indexs.length == 0) return new int[]{-1};
        int[] answer = new int[indexs[1] - indexs[0] + 1];

        int index = 0;
        for (int i = indexs[0]; i <= indexs[1]; i++) {
            answer[index] = arr[i];
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 2, 1, 4, 5, 2, 9};
        int arr[] = {1, 2, 1};
        int[] result = solution(arr);
        for (int number : result) {
            System.out.println(number);
        }
    }
}
