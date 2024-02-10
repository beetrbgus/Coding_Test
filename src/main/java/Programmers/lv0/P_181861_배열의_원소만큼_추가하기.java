package Programmers.lv0;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181861">배열의 원소만큼 추가하기</a>
 */
public class P_181861_배열의_원소만큼_추가하기 {
    public static int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        for (int element : arr) {
            for (int i = 0; i < element; i++) {
                resultList.add(element);
            }
        }
        return resultList.stream().mapToInt(value -> value)
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        int[] resultArr = solution(arr);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
