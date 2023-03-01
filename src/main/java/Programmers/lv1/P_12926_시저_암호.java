package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12926">시저 암호</a>
 */
public class P_12926_시저_암호 {
    static int nStatic;
    static int alphabetLength = 'z' - 'a'+ 1;
    public static String solution(String inputString, int n) {
        StringBuilder sb = new StringBuilder();
        nStatic = n;
        for (int i = 0; i < inputString.length(); i++) {
            char inputChar = inputString.charAt(i);
            if(inputChar == ' ') sb.append(inputChar);
            else sb.append(pushString(inputChar));
        }
        return sb.toString();
    }
    public static char pushString(char inputChar) {
        // 소문자인지 대문자인지 판단
        boolean isLowerCase = inputChar >= 'a' && inputChar <= 'z';
        int pushed = inputChar + nStatic;
        // 소문자 중 더한 값이 z를 넘어가면 되돌려 줌
        if(isLowerCase) {
            if(pushed > 'z') pushed = pushed - alphabetLength;
        }else {
            // 대문자 중 더한 값이 Z를 넘어가면 되돌려 줌
            if(pushed > 'Z' ) pushed = pushed - alphabetLength;
        }
        return (char)pushed;
    }
    public static void main(String[] args) {
        String input = "AaZz";
        int n = 25;
        String result = solution(input, n);

        System.out.println(result);

    }
}
