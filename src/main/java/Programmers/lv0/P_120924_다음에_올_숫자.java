package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120924">다음에 올 숫자</a>
 */
public class P_120924_다음에_올_숫자 {
    public static int solution(int[] common) {
        // 등차 : 두번째 항 - 첫번째 항 = 세번째 항 - 두번째 항

        // 등비가 아니라면 등차임. 등비인지 확인
        if(common[2] - common[1] == common[1] - common[0]) {
            return common[common.length - 1] + common[2] - common[1];
        }else {

            return (common[2] / common[1]) * common[common.length - 1];
        }
    }
    public static void main(String[] args) {
        int[] common = {1, 2, 3, 4};
        int result = solution(common);
        System.out.println(result);
    }
}
