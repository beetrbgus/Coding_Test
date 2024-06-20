package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/250137">붕대 감기</a>
 */
public class P_250137_붕대감기 {
    /**
     * t초 동안 붕대를 감으면서 1초마다 x 만큼 체력을 회복
     * t초 연속으로 붕대 감기 성공시 y만큼 추가 회복
     * 최대 최력 존재
     *
     * 붕대 감는 중 공격 당하면 기술 취소 후 즉시 재시전
     * 현재 체력이 0 이하가 되면 게임 끝. 체력 회복 불가.
     * bandage = [시전 시간, 초당 회복량, 추가 회복량]의 고정 길이 배열
     * 죽으면 -1 리턴
     * 모든 공격 끝난 후의 체력을 반환
     * @param bandage
     * @param health
     * @param attacks
     * @return
     */
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int index = 0;
        int bandingTime = 0;
        for (int timer = 1; timer <= attacks[attacks.length - 1][0]; timer++) {
            int attackTime = attacks[index][0];
            // 공격시 체력 닳고 붕대 감은 시간 초기화
            if(timer == attackTime) {
                int monsterPower = attacks[index][1];
                health -= monsterPower;
                bandingTime = 0;
                // 다음 공격시간
                index ++;
                if(health <= 0) return -1;
            } else {
                bandingTime ++;
                health += bandage[1];
                // 붕대 시전시간 끝나면 추가 체력
                if(bandingTime == bandage[0]) {
                    bandingTime = 0;
                    int extraHeal = bandage[2];
                    health += extraHeal;
                }
                // 최대 체력 넘으면 다시 끌어내림
                if(maxHealth <= health) health = maxHealth;
            }
        }
        return health;
    }

    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        int result = solution(bandage, health, attacks);
        System.out.println(result);
    }
}
