package BackJoon.basicmath1_.reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/11653">소인수분해</a>
 *  정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 *  첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
 */
public class B_11653_Factorization {
    /**
     * 작은 수가 앞에 나와야 하니까 해당 수로 나누어 지지 않는다면 수를 높임.
     * cnt 보다 작다면 멈춤.
     * @param input
     * @return
     */
    public static void solution(int input) {
        int cnt = 2;
        if(input == 2) System.out.println(input);
        while(input > cnt) {
            if(input % cnt == 0) {
                input /= cnt;
                System.out.println(cnt);
                cnt = 2;
                continue;
            }
            cnt++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        solution(input);
    }
}
