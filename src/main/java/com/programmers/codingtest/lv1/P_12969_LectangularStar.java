package com.programmers.codingtest.lv1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 */
public class P_12969_LectangularStar {
    /**
     * 간단한 문제라서 설명 첨부 X
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        for (int i = 0; i < inputB; i++) {
            for (int j = 0; j < inputA; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 좋아요 가장 많은 풀이 방법
     * 스트림 사용한 예를 익히기 위해서 봄.
     * 0부터 a 까지 *를 더하고
     * 0부터 b 까지 더한 문자를 반복해서 찍음.
     */
    public void solution2(int a, int b){
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
