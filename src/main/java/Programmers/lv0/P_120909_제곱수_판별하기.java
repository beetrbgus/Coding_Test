package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120909">제곱수 판별하기</a>
 */
public class P_120909_제곱수_판별하기 {
    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0? 1 : 2;
    }
    public static void main(String[] args) {
        int n = 144;
        int result = solution(n);
        System.out.println(result);

        int n2 = 976;
        int result2 = solution(n2);
        System.out.println(result2);
    }
}
