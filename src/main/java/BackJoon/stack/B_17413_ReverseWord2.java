package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 문제링크 : <a href="https://www.acmicpc.net/problem/17413"> 단어 뒤집기2 </a>
 *
 */
public class B_17413_ReverseWord2 {
    Stack<Integer> tagStack = new Stack<>();
    Stack<Character> wordStack = new Stack<>();
    StringBuilder stringBuilder = new StringBuilder();

    public String solution(String input) {
        char[] inputChars = input.toCharArray();

        for (int i = 0; i < inputChars.length; i++) {
            char inputChar = inputChars[i];

            if(inputChar == '<') {
                appendWord();
                tagStack.push(i);
            }else if(inputChar == '>'){
                int tagIndex = tagStack.pop();
                String substring;

                if(i == inputChars.length -1) substring = input.substring(tagIndex);
                else substring = input.substring(tagIndex, i+1);

                stringBuilder.append(substring);
            }else {
                if(tagStack.size() == 0) {
                    if(inputChar == ' ') {
                        appendWord();
                        stringBuilder.append(" ");
                    }else {
                        wordStack.push(inputChar);
                    }
                }
            }

        }
        appendWord();
        return stringBuilder.toString();
    }
    public void appendWord() {
        while(!wordStack.empty()) {
            stringBuilder.append(wordStack.pop());
        }
    }
    public static void main(String[] args) throws IOException {
        B_17413_ReverseWord2 reverseWord = new B_17413_ReverseWord2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String solution = reverseWord.solution(reader.readLine());
        System.out.println(solution);
    }
}