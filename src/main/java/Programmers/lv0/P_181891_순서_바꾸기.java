package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181891">순서 바꾸기</a>
 */
public class P_181891_순서_바꾸기 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            if(n == num_list.length) n = 0;
            answer[i] = num_list[n++];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;
        int[] resultArr = solution(num_list, n);
        for (int result : resultArr) {
            System.out.println(result);
        }
    }
}
