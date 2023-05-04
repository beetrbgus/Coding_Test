package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181880">1로 만들기</a>
 */
public class P_181880_1로_만들기 {
    public static int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i < num_list.length; i++) {
            int num = num_list[i];
            while(num != 1) {
                if(num % 2 == 0) num /=2;
                else num = (num - 1) / 2;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        int result = solution(num_list);
        System.out.println(result);
    }
}
