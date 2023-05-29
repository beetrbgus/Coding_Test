package Programmers.lv0;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181950">문자열 반복해서 출력하기</a>
 */
public class P_181950_문자열_반복해서_출력하기 {
    public static void solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, n)
                .forEach(operand -> sb.append(str));
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();*/
        String str = "string";
        int n = 5;
        solution(str, n);
    }

}
