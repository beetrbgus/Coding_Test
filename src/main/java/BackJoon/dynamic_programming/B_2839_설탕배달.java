package BackJoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/2839">설탕배달</a>
 */
public class B_2839_설탕배달 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int result = 0;

        if(n == 4 || n== 7) result = -1;
        else if(n%5==0) result = n/5;
        else if(n%5==1||n%5==3) result = n/5+1;
        else if(n%5==2||n%5==4) result = n/5+2;
        else result = -1;
        System.out.println(result);

    }
}
