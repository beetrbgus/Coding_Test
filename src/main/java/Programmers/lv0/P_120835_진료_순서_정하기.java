package Programmers.lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120835">진료 순서 정하기</a>
 */
public class P_120835_진료_순서_정하기 {
    public static int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            ++answer[i];
            for (int j = 0; j < length; j++) {
                if(i == j) continue;
                if(emergency[i] < emergency[j]) answer[i]++;
            }
        }
        return answer;
    }
    public int[] streamSolution(int[] emergency) {
        return Arrays.stream(emergency)
                .map(i ->
                    Arrays.stream(emergency)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(i) + 1
                )
                .toArray();
    }
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] resultArr = solution(emergency);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
