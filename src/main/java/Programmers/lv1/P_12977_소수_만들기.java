package Programmers.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12977">소수 만들기</a>
 */
public class P_12977_소수_만들기 {

    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> sumArr = new ArrayList<>();
        // 더하기의 경우의 수 모두 구하기
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            for (int j = i+1; j < nums.length - 1; j++) {
                int second = nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    int third = nums[k];
                    sumArr.add(first+second+third);
                }
            }
        }
        for (int sumNumber : sumArr) {
            boolean isPrime = true;
            if(sumNumber < 2) isPrime = false;

            for (int i = 2; i <= Math.sqrt(sumNumber); i++) {
                if(sumNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result = solution(nums);
        System.out.println(result);

        int[] nums2 = {1,2,7,6,4};
        int result2 = solution(nums2);
        System.out.println(result2);
    }
}
