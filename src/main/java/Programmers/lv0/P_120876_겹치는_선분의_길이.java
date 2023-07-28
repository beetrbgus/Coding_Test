package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120876">겹치는 선분의 길이</a>
 */
public class P_120876_겹치는_선분의_길이 {
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[201];
        for (int i = 0; i < lines.length; i++) {
            int iStart = lines[i][0] + 100;
            int iEnd = lines[i][1] + 100;
            for (int j = iStart; j < iEnd; j++) {
                if(++line[j] == 2) answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int result = solution(lines);
        System.out.println(result);
    }
}
