package com.programmers.codingtest.lv1;

import java.util.ArrayList;

/**
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 조건
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */
public class P_42840_MockExam {
    /**
     * 하드코딩하기 싫었지만 패턴의 규칙이 없어서 썼다.
     * firstMathGiveUp[] 부분에 숫자를 length로 쓰는게 좋지만 뭔가 코드가 지저분해서 숫자로 적었는데
     * 조금 더 찾아보고서 고치는게 좋을지 판단해봐야 할 것 같다.
     * 불만족하는 부분은 for문이 너무 많아서 가독성이 떨어지고
     * 뭔가 같은 일인 것 같은데 계속 중복하는 느낌이 든다.
     */
    public int[] solution(int[] answers) {
        int[] firstMathGiveUp = {1, 2, 3, 4, 5};
        int[] secondMathGiveUp = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdMathGiveUp = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        int[] result = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int answerNumber = answers[i];
            if (firstMathGiveUp[i%5] == answerNumber) score[0]++;
            if (secondMathGiveUp[i%8] == answerNumber) score[1]++;
            if (thirdMathGiveUp[i%10] == answerNumber) score[2]++;
        }
        int highestScoreCount = 0;
        int maxScore = 0 ;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                highestScoreCount++;
            }
        }

        int[] answer = new int[highestScoreCount];
        int answerIndex = 0;
        for (int i = 0; i < score.length; i++) {
            if(score[i] == maxScore) {
                answer[answerIndex] = i+1;
                answerIndex++;
            }
        }
        return answer;
    }

    /**
     * 좋아요 가장 많은 코드
     * 가독성이 좋아보인다.
     * 하지만 결과를 ArrayList에 담고 반환할 때 toArray로 보낼 때 시간이 오래걸린다.
     */
    public int[] solution2(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }

    public static void main(String[] args) {
        P_42840_MockExam mockExam = new P_42840_MockExam();
        int[] answers = {1,2,3,4,5,4,2,5,2,1,3,3,1,1,2};
        int[] solution = mockExam.solution(answers);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
