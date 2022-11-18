package Programmers.lv1;

public class P_12912_SumOfAandB {

    public long solution(int a, int b) {
        long answer = 0;

        long start = Math.min(a,b);
        long end = Math.max(a,b);

        for(long i = start; i<=end; i++) {
            answer += i;
        }

        return answer;
    }

    /**
     * 좋아요 상위의 문제 풀이
     * 등차 수열을 이용한 풀이
     * 역시 수학을 잘 알면..머리가 고생하지 않는다..
     */
    public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        P_12912_SumOfAandB sumOfAandB = new P_12912_SumOfAandB();
        int a = 3;
        int b = 5;
        System.out.println(sumOfAandB.solution(a,b));
    }
}
