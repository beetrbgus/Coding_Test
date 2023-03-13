package Programmers.lv1;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/133499">옹알이2</a>
 */
public class P_133499_옹알이2 {
    public static int solution(String[] babbling) {

        String[] babblingType = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        // 단어를 뽑아 포함되었는지 안되었는지 판단
        for (int i = 0; i < babbling.length; i++) {
            String babblingIndex = babbling[i];
            boolean containBabbling = false;


        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
        System.out.println(solution(babbling2));
    }
}
