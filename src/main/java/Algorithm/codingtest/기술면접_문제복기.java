package Algorithm.codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 기술면접_문제복기 {

    // 1. e가 들어간 목록 뽑기. 정렬은 알파벳 내림차순
    public static List<String> one(String[] array) {

        return Arrays.stream(array)
                .filter(s -> s.contains("e"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    // 2. 배열에 들어간 문자 중 길이가 5미만이면 fail, 모두 5이상이면 success
    public static String two(String[] array) {
        boolean result = Arrays.stream(array)
                .allMatch(s -> s.length() >= 5);
        return result ? "success" : "fail";
    }
    /**
     * 다음 배열의 요소를 문자열의 길이에 따라 요소를 그룹화 시키고 출력하라.
     * - 출력 예시
     * 3 : [egg]
     * 4 : [meat]
     * 5 : [apple, apple]
     * 6 : [carrot, banana]
     */
    public static Map<Integer,List<String>> groupBy(String[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(String::length));
    }

    public static void main(String[] args) {
        String[] array = {"carrot", "apple", "banana", "egg", "meat", "apple"};
        List<String> one = one(array);
        String two  = two(array);
        Map<Integer,List<String>> groupBy = groupBy(array);

        for (String content : one ) {
            System.out.println(content);
        }
        System.out.println();
        System.out.println("two   : " + two);

        System.out.println();
        groupBy.forEach((integer, strings) ->
                {
                    System.out.print(integer +": ");
                    for (String content: strings) {
                        System.out.print(content+ " ");
                    }
                    System.out.println();
                }
        );
    }
}
