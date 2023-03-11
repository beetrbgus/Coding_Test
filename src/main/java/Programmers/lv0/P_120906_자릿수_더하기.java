package Programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */
public class P_120906_자릿수_더하기 {
    public static int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10;
            n/= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 930211;
        int result = solution(n);
        System.out.println(result);
    }
}
