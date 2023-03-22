package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/161989">덧칠하기</a>
 */
public class P_161989_덧칠하기 {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int roller = section[0];
        for (int i = 0; i < section.length; i++) {
            int sectionIndex = section[i];
            // 롤러가 현재 벽 칠할 곳보다 짧으면
            if(roller <= sectionIndex) {
                answer ++;
                roller = sectionIndex + m;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        /**
         * 1 <= m <= n <= 100,000
         * 1 <= section.length <= n
         */
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        int result = solution(n, m, section);

        System.out.println(result);

        /**
         * ex : 2
         */
        int n2 = 5;
        int m2 = 4;
        int[] section2 = {1, 3};
        int result2 = solution(n2, m2, section2);

        System.out.println(result2);
        /**
         * ex : 2
         */
        int n3 = 4;
        int m3 = 1;
        int[] section3 = {1, 2, 3, 4};
        int result3 = solution(n3, m3, section3);

        System.out.println(result3);
    }
}
