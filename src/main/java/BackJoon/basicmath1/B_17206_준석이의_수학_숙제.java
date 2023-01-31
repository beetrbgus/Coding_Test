package BackJoon.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/17206
 */
public class B_17206_준석이의_수학_숙제 {
    /**
     * 3과 7 등차수열의 합을 더한 후 최소 공배수인 21을 뺌.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] numberStrs = br.readLine().split(" ");

        for (int i = 0; i < T; i++) {
            int answer = 0;
            int input = Integer.parseInt(numberStrs[i]);
            // 3 , 6, 9, 12, 15, 18 =  3, 9 , 18 , 30, 45
            answer += sumArithmeticSequence(input/3, 3, 3);
            answer += sumArithmeticSequence(input/7, 7, 7);
            answer -= sumArithmeticSequence(input/21, 21, 21);
            System.out.println(answer);
        }
    }
    public static int sumArithmeticSequence(int n, int firstNum, int sequence) {
        return n * (2*firstNum + (n-1) * sequence) / 2;
    }

}
