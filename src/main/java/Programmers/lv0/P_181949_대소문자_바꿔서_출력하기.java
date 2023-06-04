package Programmers.lv0;

import java.util.Scanner;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181949">대소문자 바꿔서 출력하기</a>
 */
public class P_181949_대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            int gap = a.charAt(i) <= 'z' && a.charAt(i) >= 'a'? 'A' - 'a' : 'a' - 'A';
            sb.append((char) (a.charAt(i) + gap));
        }
        System.out.println(sb);
    }
}
