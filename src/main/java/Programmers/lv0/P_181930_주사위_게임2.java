package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181930">주사위 게임 2</a>
 */
public class P_181930_주사위_게임2 {
    public static int solution(int a, int b, int c) {
        boolean isABEqual = a == b;
        boolean isBCEqual = b == c;
        boolean isACEqual = a == c;
        if(!isABEqual && !isBCEqual && !isACEqual) return a + b + c;
        else if (isABEqual && isBCEqual && isACEqual) {
            return (a + b + c)
                    * ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2))
                    * ((int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
        } else if (isABEqual || isBCEqual | isACEqual) {
            return (a + b + c)
                    * ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
        }
        return 0;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        int result = solution(a, b, c);
        System.out.println(result);
    }
}
