package Programmers.lv1;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/77484">로또의 최고 순위와 최저 순위</a>
 */
public class P_77484_로또의_최고_순위와_최저_순위 {
    /**
     * 0 = 알아볼 수 없는 숫자
     * */
    public static int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zeroCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            int lotto = lottos[i];
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                int win_num = win_nums[j];
                if(lotto == win_num) {
                    count++;
                    break;
                }
            }
        }
        int maxMatchCount = count + zeroCount < 2 ? 1 : count + zeroCount;
        int minMatchCount = count < 2 ? 1 : count;
        return new int[]{7 - maxMatchCount, 7 - minMatchCount};
    }
    public static void main(String[] args) {
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};
        int[] result = solution(lottos, win_nums);

        for (int prize : result) {
            System.out.println(prize);
        }

    }
}
