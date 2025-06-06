package BackJoon.기업_알고리즘_테스트_유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class P_7893_홀수 {
    public static int[] solution(int[] arr) {
        int[] array = Arrays.stream(arr)
                .filter(numberStr -> numberStr % 2 != 0)
                .sorted()
                .toArray();

        return new int[]{getSum(array), getMinNum(array)};
    }

    public static int getSum(int[] arr) {
        if(arr.length == 0) return -1;

        int[] array = Arrays.stream(arr)
                .filter(numberStr -> numberStr % 2 != 0)
                .sorted()
                .toArray();

        return Arrays.stream(array).sum();
    }

    public static int getMinNum(int[] arr) {
        if(arr.length == 0) return -1;

        int[] array = Arrays.stream(arr)
                .filter(numberStr -> numberStr % 2 != 0)
                .sorted()
                .toArray();

        return array[0];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            arr[i] = number;
        }
        int[] solution = solution(arr);
        if(solution[0] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(solution[0]);
            System.out.println(solution[1]);
        }

    }
}
