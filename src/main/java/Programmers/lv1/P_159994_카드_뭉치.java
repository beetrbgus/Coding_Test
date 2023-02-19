package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/159994">카드 뭉치</a>
 */
public class P_159994_카드_뭉치 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1에 없으면 cards2에서 뽑고 거기서도 없으면 No 반환
        // 둘 중 하나에 있으면 다음으로 넘어감
        int cardOneIndex = 0;
        int cardTwoIndex = 0;
        for (int i = 0; i < goal.length; i++) {
            String goalIndexStr = goal[i];
            // cards1 과 cards2의 길이는 다를 수도 있기 때문에 범위 조건을 추가
            if(cardOneIndex != cards1.length && goalIndexStr.equals(cards1[cardOneIndex])) {
                cardOneIndex++;
            }else if(cardTwoIndex != cards2.length && goalIndexStr.equals(cards2[cardTwoIndex])) {
                cardTwoIndex++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goals = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goals));

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        String[] goals2 = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards3, cards4, goals2));
    }
}
