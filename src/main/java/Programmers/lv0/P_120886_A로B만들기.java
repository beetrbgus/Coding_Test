package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120886">A로 B 만들기</a>
 */
public class P_120886_A로B만들기 {
    public static int solution(String before, String after) {
        for (char afterChar : after.toCharArray()) {
            before = before.replaceFirst(String.valueOf(afterChar),"");
        }
        return before.length() == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        String before ="allpe";
        String after = "apple";
        int result = solution(before, after);
        System.out.println(result);
    }
}
