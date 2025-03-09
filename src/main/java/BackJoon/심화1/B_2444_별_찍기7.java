package BackJoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2444_별_찍기7 {
    public static String solution(int n) {
        String arr[] = new String[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int starCount = 2 * (i - 1) + 1;
            String blank = " ".repeat(n-i);
            String star = "*".repeat(starCount);

            arr[i-1] = blank + star + '\n';
            sb.append(arr[i-1]);
        }

        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[arr.length - (i + 1)]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String solution = solution(n);

        System.out.println(solution);
    }
}
