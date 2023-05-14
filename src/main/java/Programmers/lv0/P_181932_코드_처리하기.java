package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181932">코드 처리하기</a>
 */
public class P_181932_코드_처리하기 {
    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean isEvenMode = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            boolean isEven = i % 2 == 0;
            if(c == '1') isEvenMode = !isEvenMode;
            else {
                if(isEvenMode && isEven) sb.append(c);
                else if (!isEvenMode && !isEven) sb.append(c);
            }
        }
        return sb.toString().isEmpty()? "EMPTY" : sb.toString();
    }
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String result = solution(code);
        System.out.println(result);
    }
}
