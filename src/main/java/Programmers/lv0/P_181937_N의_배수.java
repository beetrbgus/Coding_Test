package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181937">n의 배수</a>
 */
public class P_181937_N의_배수 {
    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        int num = 98;
        int n = 3;
        int result = solution(num, n);
        System.out.println(result);
    }
}
