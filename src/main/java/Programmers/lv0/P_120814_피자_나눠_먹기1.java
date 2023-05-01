package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120814">피자 나눠 먹기 (1)</a>
 */
public class P_120814_피자_나눠_먹기1 {
    public static int solution(int n) {
        return n/7>0 && n%7==0? n/7 : n/7 +1;
    }
    public static void main(String[] args) {
        int n = 7;
        int result = solution(n);
        System.out.println(result);
    }
}
