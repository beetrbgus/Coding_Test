package Programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181855">문자열 묶기</a>
 */
public class P_181855_문자열_묶기 {
    /**
     * 문자열의 길이별로 그룹을 지은 후
     * 해당 그룹 지은 값들을 그룹의 크기로 비교를 하면서
     * 큰 걸 가져오기
     */
    public static int solution(String[] strArr) {
        return Arrays.asList(strArr).stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream().max((o1, o2) ->
                    o1.getValue().size() > o2.getValue().size()? 1 : -1
                 )
                .get()
                .getValue().size()
                ;
    }
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};
        int result = solution(strArr);
        System.out.println(result);
    }
}
