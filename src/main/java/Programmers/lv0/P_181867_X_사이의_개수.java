package Programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *  <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181867">x 사이의 개수</a>
 */
public class P_181867_X_사이의_개수 {
    public static int[] solution(String myString) {
        Stack<Character> stack = new Stack<>();
        List<Integer> answerList = new ArrayList<>();
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char str = chars[i];
            if(str != 'x') stack.push(str);
            else {
                answerList.add(stack.size());
                stack.clear();
            }
            if(i == chars.length - 1 ) {
                answerList.add(stack.size());
            }
        }
        return answerList.stream().mapToInt(value -> value)
                .toArray();
    }

    public int[] streamSolution(String myString) {
        return Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(str -> str.length())
                .toArray();
    }
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        int[] resultArr = solution(myString);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
}
