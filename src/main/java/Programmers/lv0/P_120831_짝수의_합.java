package Programmers.lv0;

public class P_120831_짝수의_합 {
    /**
     * 등차가 2인 수열의 합 = 항의 갯수 * (첫번째항 * 2 + (항의갯수 -1) * 등차) / 2
     * 첫째항을 0으로 잡고 n이 10이라고 했을 때 0부터 10까지의 갯수는 n / 2 + 1
     */
    public static int solution(int n) {
        int count = n / 2 + 1;
        return (count) * (count - 1) * 2 /2;
    }
    public static void main(String[] args) {
        int n = 10;
        int n2 = 4;
        int result1 = solution(n);
        int result2 = solution(n2);
        System.out.println(result1);
        System.out.println();
        System.out.println(result2);

    }
}
