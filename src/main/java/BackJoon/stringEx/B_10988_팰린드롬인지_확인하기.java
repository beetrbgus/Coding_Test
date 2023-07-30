package BackJoon.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/10988">팰린드롬인지 확인하기</a>
 */
public class B_10988_팰린드롬인지_확인하기 {
    public static int solution(String myString) {
        for (int i = 0; i < myString.length() / 2; i++) {
            if(myString.charAt(i) != myString.charAt(myString.length() - (i + 1))) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
