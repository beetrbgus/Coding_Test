package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120846">합성수 찾기</a>
 *
 */
public class P_120846_합성수_찾기 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int number = i;
            int divisorCount = 0;
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if(number % j == 0) divisorCount ++;
                if(divisorCount >= 2) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        int reuslt = solution(n);
        System.out.println(reuslt);
    }
}
