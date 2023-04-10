package Programmers.lv1;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/178871">달리기 경주</a>
 *
 */
public class P_178871_달리기_경주 {
    /**
     * 부른 수
     */
    public static String[] solution(String[] players, String[] callings) {
        Map<Integer, String> rankingMap = new HashMap<>();
        Map<String, Integer> playerMap = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            rankingMap.put(i, players[i]);
        }
        for(String calling : callings) {
            Integer i = playerMap.get(calling);
            // 이전등수를 앞 등수로
            rankingMap.put(i, rankingMap.get(i - 1));
            playerMap.put(rankingMap.get(i), i);
            // 앞 등수를 이전 등수로
            rankingMap.put(i - 1, calling);
            playerMap.put(calling, i - 1);
        }
        String[] answer = new String[players.length];
        for(int i = 0; i < players.length; i++) {
            answer[i] = rankingMap.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] results = solution(players, callings);
        for (String answer : results) {
            System.out.println(answer);
        }
    }
}
