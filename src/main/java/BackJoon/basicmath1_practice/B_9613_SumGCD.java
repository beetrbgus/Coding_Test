package BackJoon.basicmath1_practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/9613">GCD 합</a>
 * 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
 * GCD = 최대 공약수 (공통된 약수 중 가장 큰 수)
 */
public class B_9613_SumGCD {
    /**
     * 유클레드 호제법
     *
     * @param input
     * @return
     */
    public static void solution (String[] input) {
        Long result = 0L;
        for (int i = 1; i < input.length; i++) {
            int first = Integer.parseInt(input[i]);

            for (int j = i + 1; j < input.length; j++) {
                int second = Integer.parseInt(input[j]);
                result += gcd(first, second);
            }
        }
        System.out.println(result);
    }
    private static int gcd(int first, int second) {
        if(second == 0) return first;
        return gcd(second, first % second);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int octal = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < octal; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            solution(input);
        }
    }
}
