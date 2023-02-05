package BackJoon.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/4134">다음 소수</a>
 */
public class B_4134_다음_소수 {
    public static Long findPrimeNumber(Long number) {
        if(number == 1 || number == 0) return 2L;

        while(true) {
            //소수 찾기 끝낸 후 소수면 멈춤
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // 나누어 떨어지는 수가 있으면 소수가 아니기 때문에 다음 숫자로
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                break;
            }
            number++;
        }
        return number;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            Long number = Long.parseLong(br.readLine());
            sb.append(findPrimeNumber(number));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
