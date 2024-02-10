package Programmers.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P_181903_QR_CODE {
    public static String solution(int q, int r, String code) {
        return IntStream.range(0, code.length())
                .filter(value -> value % q == r)
                .mapToObj(operand -> String.valueOf(code.charAt(operand)))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";

        String solution = solution(q, r, code);
        System.out.println(solution);
    }
}
