package BackJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/15649">N과 M (1)</a>
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다.
 * 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class B_15649_NAndM {
    /**
     * 풀이 방법
     * 백 트래킹에는 bfs, dfs가 있는데
     * 여기는 끝까지 간 뒤에 출력해 줘야하기 때문에 dfs
     * 재귀를 이용해서 풀기 때문에 변수들을 전역변수로 설정.
     * m개 만큼 골랐으면 출력 후 돌아감.
     */
    static int n; // 1부터 N 까지의 자연수
    static int m; // m개를 고름
    static int[] numbers = new int[9];
    static boolean[] isVisited = new boolean[9];

    public static void solution(int k) {
        if(m == k) {
            for (int i = 0; i < m; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= n; i++) {
            if(!isVisited[i]) {
                numbers[k] = i;
                isVisited[i] = true;
                solution(k + 1);
                isVisited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] readLine = br.readLine().split(" ");
        n = Integer.parseInt(readLine[0]);
        m = Integer.parseInt(readLine[1]);
        solution(0);
    }
}
