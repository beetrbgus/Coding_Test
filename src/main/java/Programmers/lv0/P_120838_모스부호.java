package Programmers.lv0;

import java.util.StringTokenizer;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120838">모스부호</a>
 */
public class P_120838_모스부호 {

    public static String solution(String letter) {
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        // 공백으로 구분
        StringTokenizer st = new StringTokenizer(letter);
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            String morseAlphabet = st.nextToken();
            for (int i = 0; i < morse.length; i++) {
                char alphabet = (char)((int)'a' + i);
                if(morse[i].equals(morseAlphabet)) {
                    sb.append(alphabet);
                    break;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }
}
