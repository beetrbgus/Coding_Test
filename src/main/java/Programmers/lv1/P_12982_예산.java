package Programmers.lv1;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12982">예산</a>
 */
public class P_12982_예산 {
    /**
     * d의 길이는 1이상 100 이하
     * 1 <= d[i] <= 10만
     * 1 <= budget <= 1000만
     * d를 정렬하면 최대한 많은 부서에 넣을 수 있음 (작은 것부터 더하기 때문)
     */
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int totalBudget = 0;
        int maxAimDepartment = 0;
        for (int i = 0; i < d.length; i++) {
            totalBudget += d[i];
            if(totalBudget <= budget) maxAimDepartment ++;
            else  break;
        }
        return maxAimDepartment;
    }
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int result = solution(d, budget);
        System.out.println(result);

    }
}
