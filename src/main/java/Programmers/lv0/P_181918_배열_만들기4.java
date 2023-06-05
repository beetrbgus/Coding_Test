package Programmers.lv0;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181918">배열 만들기 4</a>
 */
public class P_181918_배열_만들기4 {
    public static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i <= arr.length - 1) {
            int element = arr[i];
            if (stk.isEmpty()) {
                stk.push(element);
                i++;
            } else if (!stk.isEmpty()) {
                if (stk.peek() < element) {
                    stk.push(element);
                    i++;
                } else if (stk.peek() >= element) {
                    stk.pop();
                }
            }
        }

        return stk.stream()
                .mapToInt(value -> value)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int[] resultArr = solution(arr);
        for (int result: resultArr) {
            System.out.println(result + " ");
        }
    }
}
