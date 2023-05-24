package Programmers.lv0;

import java.util.stream.IntStream;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120882">등수 매기기</a>
 */
public class P_120882_등수_매기기 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        double[] scoreAvg = IntStream.range(0, score.length)
                .mapToDouble(index -> (double)(score[index][0] + score[index][1]) / score[index].length)
                .toArray();
        for (int i = 0; i < scoreAvg.length; i++) {
            answer[i]++;
            double studentA = scoreAvg[i];
            for (int j = i + 1; j < score.length; j++) {
                double studentB = scoreAvg[j];
                if(studentA > studentB) answer[j] ++;
                else if(studentA < studentB) answer[i] ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] score = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1}, {0, 0}};
        int[] result = solution(score);
        for (int rank : result) {
            System.out.print(rank + " ");
        }
    }
}
