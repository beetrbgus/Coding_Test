package BackJoon.올림피아드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_10797_10부제 {
    public static int solution(int number, String[] inputArr) {
        return (int) Arrays.stream(inputArr)
                .filter(numberStr -> Integer.parseInt(numberStr) == number).count();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String[] input = bufferedReader.readLine().split(" ");

        int result = solution(number, input);

        System.out.println(result);
    }
}
