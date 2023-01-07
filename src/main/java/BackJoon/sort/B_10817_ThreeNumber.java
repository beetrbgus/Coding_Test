package BackJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/10817">세 수</a>
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 * 두 번째로 큰 정수를 출력한다.
 */
public class B_10817_ThreeNumber {

    static int solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] readLine = br.readLine().split(" ");
        int[] arr = new int[readLine.length];
        for (int i = 0; i < readLine.length; i++) {
            arr[i] = Integer.parseInt(readLine[i]);
        }
        System.out.println(solution(arr));

    }
}
