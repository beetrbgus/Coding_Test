package BackJoon.basicmath1_practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/1212">8진수 2진수</a>
 * 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 * 시간초과
 */
public class B_1212_OctalToBinary_2 {
    /**
     * 1번 방법에서 시간 초과가 났기 때문에 방법을 다르게 해 봄.
     * 시간이 문제라면 8진수의 경우의 수를 배열로 만들어 관리.
     *
     * 키 포인트는 2진수 값이 0010011과 같이 맨 앞에 0이 왔을 때는 10011처럼 제거해줘야 함.
     * 때문에 결과 값에서 제거해 줌.
     * @param octal
     * @return
     */
    public static String solution (String octal) {
        String[] binary = {"000","001","010","011","100","101","110","111"};
        char[] octalCharArr = octal.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < octalCharArr.length; i++) {
            int octalNum = octalCharArr[i] - '0';
            stringBuilder.append(binary[octalNum]);
        }

        while(stringBuilder.charAt(0) == '0' && stringBuilder.length() > 1) {
            stringBuilder.deleteCharAt(0);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String octal = bufferedReader.readLine();
        System.out.println(solution(octal));
    }
}
