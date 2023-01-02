package BackJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.acmicpc.net/problem/2750">수 정렬하기</a><br>
 * 23.01.02 풀이 코드
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.<br>
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. <br>
 * 둘째 줄부터 N개의 줄에는 수가 주어진다.<br>
 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 */
public class B_2750_now {
	static int numCount;
	static int[] arr;

	static void solution() {
		Arrays.sort(arr);
		for (int num: arr) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numCount= Integer.parseInt(br.readLine());
		arr = new int[numCount];

		for (int i = 0; i < numCount; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		solution();
		br.close();
	}
}
