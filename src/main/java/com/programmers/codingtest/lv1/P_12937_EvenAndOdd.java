package com.programmers.codingtest.lv1;

public class P_12937_EvenAndOdd {
    public String solution(int num) {
        return (num%2!=0)?"Odd":"Even";
    }

    public static void main(String[] args) {
        P_12937_EvenAndOdd a = new P_12937_EvenAndOdd();
        int num = 3;
        a.solution(num);
    }
}
