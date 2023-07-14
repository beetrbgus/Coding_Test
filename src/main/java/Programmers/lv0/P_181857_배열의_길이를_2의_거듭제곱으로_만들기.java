package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181857">배열의 길이를 2의 거듭제곱으로 만들기</a>
 */
public class P_181857_배열의_길이를_2의_거듭제곱으로_만들기 {
    public static int[] solution(int[] arr) {
        int arrLength = arr.length;
        int minimumLength = (int)Math.ceil(Math.log(arr.length) / Math.log(2));

        return IntStream.range(0, (int)Math.pow(2, minimumLength))
                .map(i -> arrLength > i ? arr[i] : 0)
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {58, 172, 746, 89};
        int[] resultArr = solution(arr);
        for (int result :resultArr) {
            System.out.println(result);
        }
    }
}
