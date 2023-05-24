package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181917">간단한 논리 연산</a>
 */
public class P_181917_간단한_논리_연산 {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
    public static void main(String[] args) {
        boolean result = solution(false, true, true, true);
        System.out.println(result);
    }
}
