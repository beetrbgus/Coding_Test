package Programmers.lv0;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181860">빈 배열에 추가, 삭제하기</a>
 */
public class P_181860_빈_배열에_추가_삭제하기 {
    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    result.push(arr[i]);
                }
            }else {
                for (int j = 0; j < arr[i]; j++) {
                    result.pop();
                }
            }
        }
        int stackSize = result.size();
        int[] answer = new int[stackSize];
        for (int i = 0; i < stackSize; i++) {
            answer[stackSize-(1 + i)] = result.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag ={true, false, true, false, false};
        int[] resultArr = solution(arr, flag);
        for (int result :resultArr) {
            System.out.println(result);
        }
    }
}
