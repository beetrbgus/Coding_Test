package BackJoon.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.acmicpc.net/problem/11068">회문인 수</a>
 */
public class B_11068_회문인_수 {
    // toString으로 만들 수 있는 진법은 32진법까지이기 때문에 수동으로 생성
    public static List<Integer> makeRadixNumber(int radix, int number) {
        List<Integer> convert = new ArrayList<>();
        while (number != 0) {
            convert.add(number % radix);
            number/=radix;
        }
        return convert;
    }
    public static int solution(int number) {
        boolean isPalindrome = false;

        for (int i = 2; i <= 64; i++) {
            List<Integer> radixNumber = makeRadixNumber(i, number);
            if(isPalindrome(radixNumber)) {
                isPalindrome = true;
                break;
            }
        }
        return isPalindrome ? 1 : 0;
    }
    public static boolean isPalindrome(List<Integer> radixNumber) {
        int halfOfLength = radixNumber.size() / 2;
        for (int i = 0; i < halfOfLength; i++) {
            // 길이가 홀수, 짝수에 관계없음
            if(radixNumber.get(i) != radixNumber.get(radixNumber.size() -1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 입력 갯수

        for (int i = 0; i < T; i++) {
            int number = Integer.parseInt(br.readLine());
            System.out.println(solution(number));
        }
    }
}
