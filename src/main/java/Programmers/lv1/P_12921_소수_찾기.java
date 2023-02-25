package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12921">소수 찾기</a>
 */
public class P_12921_소수_찾기 {
    /**
     * 1부터 n 사이의 소수 개수 구하기
     */
    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        int result1 = solution(n);
        System.out.println(result1);

        int n2 = 5;
        int result2 = solution(n2);
        System.out.println(result2);
    }
}
