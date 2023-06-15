package Programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/176963">추억 점수</a>
 */
public class P_176963_추억_점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> peopleMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            peopleMap.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += peopleMap.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }

    /**
     * 스트림 괴물 답안.. Map.entry라는 걸 처음 알았다.
     * 이거 보고 조금 더 스트림 공부와 컬렉션 공부를 해야겠다.
     */
    public int[] streamSolution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map =
                IntStream.range(0, name.length)
                    .mapToObj(operand -> Map.entry(name[operand], yearning[operand]))
                    .collect(Collectors.toSet())
                        .stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return Arrays.stream(photo)
                .mapToInt(strings -> Arrays.stream(strings)
                                        .mapToInt(value -> map.getOrDefault(value, 0))
                                        .sum()
                ).toArray();
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] resultArr = solution(name, yearning, photo);
        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
