package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/178871">달리기 경주</a>
 * 테스트 9 - 13까지 시간초과가 뜸.
 */
public class P_178871_달리기_경주_시간초과 {
    public static String[] solution(String[] players, String[] callings) {
        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            for (int j = 0; j < players.length; j++) {
                String player = players[j];

                if(player.equals(calling)) {
                    String temp = player;
                    players[j] = players[j-1];
                    players[j-1] = temp;
                }
            }
        }
        return players;
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
