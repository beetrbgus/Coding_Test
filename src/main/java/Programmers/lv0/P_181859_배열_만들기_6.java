package Programmers.lv0;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181859">배열 만들기 6</a>
 */
public class P_181859_배열_만들기_6 {
    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() == arr[i]) {
                stack.pop();
            } else{
                stack.push(arr[i]);
            }
            i++;
        }
        if(stack.size() == 0) return new int[] {-1};
        return stack.stream().mapToInt(value -> value)
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        int[] resultArr = solution(arr);
        for (int result : resultArr) {
            System.out.println(result + " ");
        }
    }
}
