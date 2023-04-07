package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120892">암호 해독
 * </a>
 */
public class P_120892_암호_해독 {
    public static String solution(String cipher, int code) {
        // 반복문 돌리면서 i+1이 code로 나눈 나머지가 0일 때 append
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            if((i + 1) % code == 0) sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String result = solution(cipher, code);
        System.out.println(result);
    }
}
