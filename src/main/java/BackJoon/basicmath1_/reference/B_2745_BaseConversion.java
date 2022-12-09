package BackJoon.basicmath1_.reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/2745">진법 변환</a>
 *  B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *  10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 *  A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *  첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
 *
 *  B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
 */
public class B_2745_BaseConversion {
    /**
     * 문자를 받아서 char 배열로 만들어 하나씩 돌림.
     * char의 인덱스를 하나씩 받아서 숫자로 변환.
     * 변환한 숫자를 자릿수만큼 곱해 줌.
     * 결과를 더해 줌.
     * @param N
     * @param B
     * @return
     */
    public static Long solution(String N, int B) {
        char[] NChars = N.toCharArray();
        Long result = 0L;

        for (int i = 0; i < NChars.length; i++) {
            char nChar = NChars[i];
            int nCharNumber = 0;

            if(nChar >= '0' && nChar <= '9') nCharNumber = nChar - '0'; // nChar가 숫자일 때
            else nCharNumber = nChar - 55; // nChar가 A-Z일 때

            for (int j = NChars.length - 1 - i; j > 0; j--) {
                nCharNumber *= B;
            }
            result+= nCharNumber;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        String N = input[0]; // 숫자
        int B = Integer.parseInt(input[1]); // 진법
        System.out.println(solution(N,B));
//        String n = "ZZZZZ";
//        int b = 36;
//        System.out.println(solution(n, b));

    }
}
