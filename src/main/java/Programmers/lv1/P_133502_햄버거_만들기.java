package Programmers.lv1;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/133502">햄버거 만들기</a>
 */
public class P_133502_햄버거_만들기 {
    /**
     * 빵 -> 야채 -> 고기 -> 빵 순으로만 햄버거를 만듦. ( 1 -> 2 -> 3 -> 1 )
     * 빵 : 1, 야채 : 2, 고기 : 3
     */
    static int[] burgerOrder = {1,2,3,1};
    static int burgetIndex = 0;
    public static int solution(int[] ingredient) {
        // 재료가 쌓아져 있고 순차적으로 되어야하기 때문에 Stack 활용
        Stack<Integer> stack = new Stack();
        int answer = 0;
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            int stackSize = stack.size();
            // 재료의 크기가 4이상이면 맨 위부터 4개의 항목을 확인함.
            if(stackSize > 3) {
                boolean isFullIngredient = true;
                for (int j = 4; j > 0; j--) {
                    if(stack.get(stackSize - j) != burgerOrder[burgerOrder.length - j]) {
                        isFullIngredient = false;
                        break;
                    }
                }
                // 재료가 모두 맞다면 위에서부터 제거
                if(isFullIngredient) {
                    answer ++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int result1 = solution(ingredient);
        System.out.println("result1    :" + result1);
        System.out.println();

        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int result2 = solution(ingredient2);
        System.out.println("result2    :" + result2);
        System.out.println();
    }
}
