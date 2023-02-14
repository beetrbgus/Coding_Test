package Programmers.lv1;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/86491">최소직사각형</a>
 */
public class P_86491_최소직사각형 {
    public static int solution(int[][] sizes) {
        /**
         * 생각 해 본 것 : 정렬하면 되지 않을까?
         * 정렬하면 작은건 앞으로 가고, 큰건 뒤로가니까 편차가 가장 작은 지갑을 만들 수 있을 것 같음.
         */
        int min = 0;
        int max = 0;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            // 작은 것 중 최대값을 구하면 다 넣을 수 있는 카드지갑의 길이
            if(min < sizes[i][0]) {
                min = sizes[i][0];
            }
            if(max < sizes[i][1]) {
                max = sizes[i][1];
            }
        }
        return min * max;
    }
    public static void main(String[] args) {
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(solution(sizes1));
        System.out.println(solution(sizes2));
        System.out.println(solution(sizes3));
    }
}
