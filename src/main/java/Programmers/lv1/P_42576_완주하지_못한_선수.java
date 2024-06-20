package Programmers.lv1;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42576">완주하지 못한 선수</a>
 */
public class P_42576_완주하지_못한_선수 {
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> paticipantMap = new HashMap<>();
        String answer = "";
        // Map에 참가자 인원을 넣음. 중복 이름도 있기 때문에 같은 이름도 여러명이 될 수 있음.
        for (int i = 0; i < participant.length; i++) {
            Integer paticipantCount = paticipantMap.getOrDefault(participant[i], 0);
            paticipantMap.put(participant[i], ++paticipantCount);
        }
        // 완주한 사람은 지워냄
        for (int i = 0; i < completion.length; i++) {
            Integer paticipantCount = paticipantMap.get(completion[i]);
            paticipantMap.put(completion[i], --paticipantCount);
        }
        // 남은 사람은 0이 아니라 1일 것임. (한명만 완주 못했기 때문) 1인 것 찾아서 return
        for (String name : paticipantMap.keySet()) {
            if(paticipantMap.get(name) == 1) answer = name;
        }
        return answer;
    }
    
    // 개선된 해결 방안
    public static String solution2(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();
        // 완주 선수들 이름 저장
        for (String maratonerName : completion) {
            hashMap.put(maratonerName, hashMap.getOrDefault(maratonerName, 0) + 1);
        }

        for (String maratonerName : participant) {
            // 완주하지 못한 선수 찾으면 반환
            if(hashMap.getOrDefault(maratonerName, 0) == 0) {
                return maratonerName;
            }
            hashMap.put(maratonerName, hashMap.get(maratonerName) - 1);
        }
        return null;
    }
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = solution(participant, completion);
        System.out.println(result);
    }
}
