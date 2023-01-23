package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/134240">푸드 파이트 대회</a>
 */
public class P_134240_푸드_파이트_대회 {
    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        // 0번째는 물임 때문에 1번쨰 원소부터 탐색
        for (int i = 1; i < food.length; i++) {
            // i = i번 음식
            // 음식수만큼 반복해서 붙여줌
            String foodStr = String.valueOf(i).repeat(food[i] / 2);
            sb.append(foodStr);
        }
        // B 참가자는 A 참가자음식 순서의 반대이기 때문에 reverse
        return sb.toString() + "0" + sb.reverse();
    }
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        String result = solution(food);
        System.out.println(result);
    }
}
