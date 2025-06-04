package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/388351">유연 근무제</a>
 */
public class P_388351_유연근무제 {
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        int schedules[] = {700, 800, 1100};
        int timelogs[][] = {
            {710, 2359, 1050, 700, 650, 631, 659}
            , {800, 801, 805, 800, 759, 810, 809}
            , {1105, 1001, 1002, 600, 1059, 1001, 1100}
        };
        int startday = 5;

        int result = solution(schedules, timelogs, startday);

        System.out.println(result);

        double start = 300;
        for (int i = 0; i < 10; i++) {
            start = start * 1.5;
        }

        System.out.println(start);
    }
}
