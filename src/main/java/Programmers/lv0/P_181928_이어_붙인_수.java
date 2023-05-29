package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181928">이어 붙인 수</a>
 */
public class P_181928_이어_붙인_수 {
    public static int solution(int[] num_list) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            int element = num_list[i];
            if(element % 2 ==0) oddSb.append(element);
             else evenSb.append(element);
        }
        return Integer.valueOf(oddSb.toString()) + Integer.valueOf(evenSb.toString());
    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }
}
