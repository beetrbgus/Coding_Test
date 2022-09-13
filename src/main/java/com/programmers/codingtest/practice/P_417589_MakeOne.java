package com.programmers.codingtest.practice;

public class P_417589_MakeOne {
    public int solution(int num2) {
        int answer = 0;
        Long num = Long.valueOf(num2);
        while(num != 1 && answer <=500) {
            if(num % 2 == 0) {
                num = num/2;
            }else {
                num = (num * 3) + 1;
            }
            answer++;
        }

        if(answer >=500) answer = -1;
        return answer;
    }
    public static void main(String args[]) {
        P_417589_MakeOne a = new P_417589_MakeOne();
        int solution = a.solution(626331);
        System.out.println(solution);
    }
}
