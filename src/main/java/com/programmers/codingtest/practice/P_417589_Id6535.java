package com.programmers.codingtest.practice;

public class P_417589_Id6535 {
    public int[] solution(int[] numbers) {
        int[] sum = new int[200];
        for(int i=0;i<numbers.length; i++) {
            int numberI = numbers[i];
            for(int j=i+1; j <numbers.length; j++) {
                int numberJ = numbers[j];
                sum[numberI + numberJ]++;
            }
        }
        int count = 0;
        for(int i=0; i < sum.length; i++) {
            if(sum[i]!=0){
                count++;
            }
        }
        int[] answer = new int[count];
        int index = 0;

        for(int i=0;i<numbers.length; i++) {
            if(sum[i]!=0){
                answer[index] = sum[i];
                index ++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        P_417589_Id6535 a = new P_417589_Id6535();
        int numbers[] = {2,1,3,4,1};
        int[] solution = a.solution(numbers);
        System.out.println(solution);
    }

}
