package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120885">이진수 더하기</a>
 */
public class P_120885_이진수_더하기 {
    public static String solution(String bin1, String bin2) {
        // 두개를 이진수에서 숫자로 만들어 다시 문자로 변경하면 됨.
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1, bin2));
    }
}
