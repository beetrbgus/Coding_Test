<<<<<<<< HEAD:src/main/java/Programmers/practice/P_417609_FirstQuiz.java
package Programmers.practice;
========
package codingtest.practice;
>>>>>>>> origin/main:Programmer/src/main/java/codingtest/practice/P_417609_FirstQuiz.java

import java.util.Scanner;
// 별 찍기
public class P_417609_FirstQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 세로
        int b = sc.nextInt(); // 가로

        System.out.println(a + b);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
