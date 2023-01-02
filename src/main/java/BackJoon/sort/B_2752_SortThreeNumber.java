package BackJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.acmicpc.net/problem/2752">세수정렬</a>
 * 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
 * 숫자 세 개가 주어진다. 이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 숫자는 모두 다르다.
 * 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
 *
 * 예제 입력 1
 * 3 1 2
 * 예제 출력 1
 * 1 2 3
 */
public class B_2752_SortThreeNumber {
	static int numCount = 3;
	public static String solution(int[] input) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(input);
		for (int i = 0; i < numCount; i++) {
			sb.append(input[i]);
			if(i <= numCount - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inpputArr = br.readLine().split(" ");
		int[] arr = new int[numCount];
		for (int i = 0; i < numCount; i++) {
			arr[i] = Integer.parseInt(inpputArr[i]);
		}
		System.out.println(solution(arr));
		br.close();
	}
}
