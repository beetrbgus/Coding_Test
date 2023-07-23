package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181839">주사위 게임 1</a>
 */
public class P_181839_주사위_게임1 {
    public static int solution(int a, int b) {
        boolean isAOdd = a % 2 == 1;
        boolean isBOdd = b % 2 == 1;
        if(isAOdd && isBOdd) return (int)(Math.pow(a, 2) + Math.pow(b, 2));
        else if(isAOdd || isBOdd) return 2 * (a + b);
        else return Math.abs(a - b);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = solution(a, b);

        System.out.println(result);
    }
}
