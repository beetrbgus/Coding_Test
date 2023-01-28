package BackJoon.linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * <a href="https://www.acmicpc.net/problem/5397">키로거 </a>
 *  입력 예시
 *
 *  2
 * <<BP<A>>Cd-
 * ThIsIsS3Cr3t
 *
 * 출력 예시
 *
 * BAPC
 * ThIsIsS3Cr3t
 */
public class B_5397_키로거 {
    static StringBuilder sb = new StringBuilder();
    static LinkedList<Character> keyInput;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            keyInput = new LinkedList<>();
            ListIterator<Character> iter = keyInput.listIterator();
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < input.length; j++) {
                char inputChar = input[j];
                if(inputChar == '<') {
                    if(iter.hasPrevious()) {
                        iter.previous();
                    }
                }else if (inputChar == '>') {
                    if(iter.hasNext()) {
                        iter.next();
                    }
                }else if (inputChar == '-') {
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                }else {
                    iter.add(inputChar);
                }
            }
            for (char word :keyInput) {
                sb.append(word);
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
