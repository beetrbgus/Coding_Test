package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120837">개미 군단</a>
 */
public class P_120837_개미_군단 {
    public static int solution(int hp) {
        return hp / 5 + (hp % 5) / 3 + ((hp % 5) % 3);
    }
    public static void main(String[] args) {
        int hp = 23;
        int result = solution(hp);
        System.out.println(result);
    }
}
