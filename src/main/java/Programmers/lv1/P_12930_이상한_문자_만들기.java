package Programmers.lv1;

/**
 * <a href="https://https://school.programmers.co.kr/learn/courses/30/lessons/12930">이상한 문자 만들기</a>
 */
public class P_12930_이상한_문자_만들기 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i=0;i<s.length();i++) {
            char charAt = s.charAt(i);
            if(charAt == ' ') {
                index = 0;
                sb.append(charAt);
                continue;
            }
            charAt = (index % 2 == 0) ? charAt = Character.toUpperCase(charAt) : Character.toLowerCase(charAt);
            sb.append(charAt);
            index++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
