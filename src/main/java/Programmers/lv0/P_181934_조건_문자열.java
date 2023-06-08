package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181934">조건 문자열</a>
 */
public class P_181934_조건_문자열 {
    public static int solution(String ineq, String eq, int n, int m) {
        boolean isSame = eq.equals("=");
        boolean isLarge = false;
        if(isSame) {
            isLarge = ineq.equals(">") ? n >= m : n <= m;
        }else {
            isLarge = ineq.equals(">") ? n > m : n < m;
        }
        return isLarge ? 1 : 0;
    }

    public static void main(String[] args) {
        String ineq = ">";
        String eq = "!";
        int n  = 41;
        int m = 78;
        int result = solution(ineq, eq, n, m);
        System.out.println(result);
    }
}
