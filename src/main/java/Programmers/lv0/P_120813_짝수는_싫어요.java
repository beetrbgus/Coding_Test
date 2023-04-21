package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120813">짝수는 싫어요</a>
 */
public class P_120813_짝수는_싫어요 {
    public static int[] solution(int n) {
        int arrLength = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[arrLength];
        int index = 0;
        for (int i = 1; i <= n; i+=2) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] result = solution(n);

        for (int index : result) {
            System.out.println(index);
        }
    }
}
