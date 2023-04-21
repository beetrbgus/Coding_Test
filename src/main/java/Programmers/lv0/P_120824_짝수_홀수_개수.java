package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120824">짝수 홀수 개수</a>
 * 짝수가 앞에 위치, 홀수가 뒤에 위치하기 때문에
 * 인덱스를 number%2로 하면 됨!
 */
public class P_120824_짝수_홀수_개수 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int number : num_list) {
            answer[number%2]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);
        System.out.println("짝수 개수   : " + result[0]);
        System.out.println("홀수 개수   : " + result[1]);
    }
}
