package Programmers.lv1;

import java.util.HashSet;
import java.util.Set;

/**
 * 당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다.
 * 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
 * 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다.
 * 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
 * 예를 들어 연구실에 총 4마리의 폰켓몬이 있고,
 * 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다.
 * 이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
 *
 * 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
 * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때,
 * N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
 * 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P_1845_PhoneKetmon {
    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // 포켓몬 종류가 선택할 수 있는 종류의 숫자보다 많다면 절반을 선택할 수 있음.
        if(answer < set.size()) return answer;
        // 포켓몬 종류가 더 작다면 최대치는 포켓몬 종류가 됨.
        else return set.size();
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6};
         int[] nums = {3,3,3,2,2,4};
        System.out.println(solution(nums));
    }
}
