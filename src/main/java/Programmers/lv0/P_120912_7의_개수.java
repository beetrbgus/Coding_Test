package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120912">7의 개수</a>
 */
public class P_120912_7의_개수 {
    public static int solution(int[] array) {
        int answer = 0;
        for (int element : array) {
            do {
                int isSeven = element % 10 == 7 ? 1 : 0;
                answer += isSeven;
                element /= 10;
            } while(element > 1);
        }
        return answer;
    }

    /**
     * Stream을 2중 반복해서 2중 for문처럼 씀
     * String으로 만들어서 모두 연결시키고  ex: 12,34,56,7을
     * 1234567 -> 1,2,3,4,5,6,7 로 분리시킴
     * @param array
     * @return
     */
    public int streamSolution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        int result = solution(array);
        System.out.println(result);
    }
}
