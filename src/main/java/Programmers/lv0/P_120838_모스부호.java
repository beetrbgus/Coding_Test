package Programmers.lv0;

import java.util.StringTokenizer;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120838">모스부호</a>
 */
public class P_120838_모스부호 {

    public static String solution(String letter) {
        // 모스부호 목록. 규칙이 없기 때문에 하드코딩으로 작성
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        // letter를 공백으로 구분
        StringTokenizer st = new StringTokenizer(letter);

        StringBuilder sb = new StringBuilder();
        // 토큰이 존재하지 않을 때까지 반복 = 배열의 끝까지 반복
        while(st.hasMoreTokens()) {
            String morseAlphabet = st.nextToken();
            for (int i = 0; i < morse.length; i++) {
                // 모스부호의 알파벳을 구함
                char alphabet = (char)('a' + i);
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
        System.out.println((char)('a' + 1));
    }
}
