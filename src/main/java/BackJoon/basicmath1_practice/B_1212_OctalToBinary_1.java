package BackJoon.basicmath1_practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/1212">8진수 2진수</a>
 * 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 * 시간초과
 */
public class B_1212_OctalToBinary_1 {
    /**
     * 8진수 -> 2진수 = 8진수의 한자리는 2진수의 3자리임.
     * ex : 8진수 7 = 2진수 111
     *
     * @param octal
     * @return
     */
    public static String solution (String octal) {
        // 204 = 128 + 64 + 0 + 0 + 8 + 4 + 0 + 0= 11001100
        char[] octalCharArr = octal.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = octalCharArr.length - 1; i >= 0; i--) {
            int octalNum = octalCharArr[i] - '0';
            stringBuilder.insert(0, getOctalToBinary(octalNum, i));
        }
        return stringBuilder.toString();
    }

    private static String getOctalToBinary(int octalNum, int index) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            if(index == 0 && i == 2 && octalNum % 2 == 0) continue;
            stringBuilder.insert(0,octalNum % 2);
            octalNum /= 2;
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String octal = bufferedReader.readLine();
        System.out.println(solution(octal));
    }
}
