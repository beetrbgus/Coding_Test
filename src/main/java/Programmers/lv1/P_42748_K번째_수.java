package Programmers.lv1;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42748">K번째 수</a>
 *
 */
public class P_42748_K번째_수 {
    public static int[] solution(int[] array, int[][] commands) {
        // 정답은 command의 갯수만큼 나옴
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int indexEnd = commands[i][1];
            int indexStart = commands[i][0];
            // 자를 배열이 몇개인지 담을 배열 만들어 줌
            int[] split = new int[indexEnd - indexStart + 1];
            int splitIndex = 0;
            // array에서 자른 숫자들을 배열에 담아 줌
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                split[splitIndex] = array[j];
                splitIndex++;
            }
            // 정렬 후 숫자를 뽑아 정답 배열에 추가
            Arrays.sort(split);
            answer[i] = split[commands[i][2] - 1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = solution(array, commands);
        for (int result :solution) {
            System.out.print(result + " ");
        }
    }
}
