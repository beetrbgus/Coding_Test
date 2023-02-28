package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12928">약수의 합</a>
 */
public class P_12928_약수의_합 {
    /**
     * x의 약수는 보통
     * x를 i로 나눴을 때 0이 되면
     * 나머지 약수는 n / i가 됨.
     * 그러면 절반만 돌아도 되니까 효율적이라고 생각
     */
    public static int solution(int n) {
        int answer = 0;
        if(n==0) return 0;

        for (int i = 1; i < n/2; i++) {
            if( n % i == 0) {
                answer += i + (n / i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n  = 12;
        int n2 = 5;
        int result1 = solution(n);
        int result2 = solution(n2);

        System.out.println(result1);
        System.out.println();
        System.out.println(result2);
    }
}
