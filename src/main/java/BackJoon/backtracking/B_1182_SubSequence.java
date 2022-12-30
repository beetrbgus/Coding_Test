package BackJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://www.acmicpc.net/problem/1182">부분수열의 합</a>
 * N개의 정수로 이루어진 수열이 있을 때,
 * 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다.
 * (1 ≤ N ≤ 20, |S| ≤ 1,000,000)
 * 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다.
 * 주어지는 정수의 절댓값은 100,000을 넘지 않는다.
 */
public class B_1182_SubSequence {
    static int N ; // 정수 개수
    static int S ; // 더한 값
    static int[] sequence; // 수열의 배열
    static int answer; // 부분 수열의 갯수

    public static void solution(int depth, int sum) {
        if(N == depth) {
            if(sum == S) answer++;
            return ;
        }
        solution(depth + 1, sum + sequence[depth]);
        solution(depth + 1, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] readLine = br.readLine().split(" ");
        N = Integer.parseInt(readLine[0]);
        S = Integer.parseInt(readLine[1]);

        String[] input = br.readLine().split(" ");
        sequence = Arrays.stream(input).flatMapToInt(s -> IntStream.of(Integer.parseInt(s))).toArray();
        solution(0, 0);

        int result = (S == 0) ? answer - 1 : answer;
        System.out.println(result);
    }
}
