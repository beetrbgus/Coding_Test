package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 문제링크 : <a href="https://www.acmicpc.net/problem/17413"> 단어 뒤집기2 </a>
 *
 */
public class B_17413_ReverseWord2_2 {
    Stack<Character> wordStack = new Stack<>();
    StringBuilder result = new StringBuilder();

    public String solution(String input) {
        int tagIndex = 0;
        boolean isInAngleBracket = false;

        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);

            if(inputChar == '<') {
                appendWord();
                tagIndex = i;
                isInAngleBracket = true;
            }else if(inputChar == '>'){
                String substring;

                if(i == input.length() -1) substring = input.substring(tagIndex);
                else substring = input.substring(tagIndex, i+1);

                result.append(substring);
                tagIndex = 0;
                isInAngleBracket = false;
            }else {
                if(!isInAngleBracket) {
                    if(inputChar == ' ') {
                        appendWord();
                        result.append(" ");
                    }else {
                        wordStack.push(inputChar);
                    }
                }
            }

        }
        appendWord();
        return result.toString();
    }
    public void appendWord() {
        while(!wordStack.empty()) {
            result.append(wordStack.pop());
        }
    }
    public static void main(String[] args) throws IOException {
        B_17413_ReverseWord2_2 reverseWord = new B_17413_ReverseWord2_2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String solution = reverseWord.solution(reader.readLine());
        System.out.println(solution);
    }
}