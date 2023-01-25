package Programmers.lv0;

import java.util.Scanner;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120823?language=java">직각삼각형 출력하기</a>
 *
 */
public class P_1208237_직각삼각형출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j <= i; j ++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
