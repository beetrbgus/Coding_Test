package BackJoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/2775">부녀회장이 될테야 </a>
 *
 *
 */
public class B_2775_부녀회장이_될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());// 층
            int n = Integer.parseInt(br.readLine());// 호
            sb.append(getLivedPeople(k, n));
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }

    public static int getLivedPeople(int k, int n) {
        if (n == 1)return 1;
        if (n == 2)return k+2;
        int[][] arr = new int[k+1][n];
        for (int i = 0; i < k+1; i++) {
            arr[i][0] = 1;
            for (int j = 1; j < n; j++) {
                if(i==0) arr[0][j] = j+1;
                else arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[k][n-1];
    }
}
