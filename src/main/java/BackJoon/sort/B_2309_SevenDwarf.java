package BackJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.acmicpc.net/problem/2309">일곱 난쟁이</a>
 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다.
 * 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 *
 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
 * 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 *
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 * 난쟁이의 키 <= 100
 * 아홉 난쟁이의 키는 모두 다름.
 */
public class B_2309_SevenDwarf {
    static int[] heights = new int[9];
    static int expect = 100;
    static int heightSum = 0;

    /**
     * 9개가 입력되지만 7개만 선택해야 함.
     * 일곱 난쟁이의 키의 합 = 100
     * 나머지 2명의 스파이는 100에서 초과하기 때문에
     * 아홉 난쟁이 키 합 - 나머지2명의 조합 = 100 이 된다면
     * 답을 구할 수 있음.
     */
    public static void solution() {
        boolean isFindResult = false;
        Arrays.sort(heights);
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if(heightSum - (heights[i] + heights[j]) == expect) {
                    heights[i] = 0;
                    heights[j] = 0;
                    isFindResult = true;
                    break;
                }
            }
            if(isFindResult) break;
        }

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != 0) {
                System.out.println(heights[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            heightSum += heights[i];
        }
        solution();
    }
}
