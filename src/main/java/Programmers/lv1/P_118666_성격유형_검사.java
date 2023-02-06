package Programmers.lv1;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022 카카오 테크 인턴쉽
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/118666">성격 유형 검사하기</a>
 */
public class P_118666_성격유형_검사 {
    public static String solution(String[] survey, int[] choices) {
        Map<Character, Integer> personalityType = new HashMap<>();

        int scoreStandard = 4;
        // 기준을 선택 4로 두고 음수면 앞부분의 점수가 높음, 양수면 뒷부분의 점수가 높음
        for (int i = 0; i < survey.length; i++) {
            char type = survey[i].charAt(1);
            int score = scoreStandard - choices[i];

            if(score == 0) {
                // 모르겠음이면 사전순(작은 것)을 추가해야 함.
                type = survey[i].charAt(0) < survey[i].charAt(1) ?
                                survey[i].charAt(0) : survey[i].charAt(1);
            }else if(score > 0) {
                type = survey[i].charAt(0);
            }
            // 기존의 성격유형 점수를 map에서 가져옴
            Integer personalScore = personalityType.getOrDefault(type, 0);
            // 음수일 수도 있으니 점수를 절대값으로 추가
            personalityType.put(type,personalScore + Math.abs(score));
        }
        return new StringBuilder()
                .append(personalityType.getOrDefault('R', 0) >= personalityType.getOrDefault('T', 0) ? 'R' : 'T')
                .append(personalityType.getOrDefault('C', 0) >= personalityType.getOrDefault('F', 0) ? 'C' : 'F')
                .append(personalityType.getOrDefault('J', 0) >= personalityType.getOrDefault('M', 0) ? 'J' : 'M')
                .append(personalityType.getOrDefault('A', 0) >= personalityType.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String result = solution(survey, choices);
        System.out.println(result);
    }
}
