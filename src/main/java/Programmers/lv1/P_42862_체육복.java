package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42862">체육복</a>
 *
 */
public class P_42862_체육복 {
    /**
     * 학생수 : 2 <= n <= 30
     * 체육복 도난당한 학생 수 : 1<= lost.length <= n (중복X)
     * 여벌 체육복 : 1<= reserve.length <= n (중복X)
     * 여벌 체육복도 도난당할 수 있음
     */
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        int answer = 0;
        // 여벌 체육복 수 추가
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1]++;
        }
        // 잃어버린 체육복 뺌
        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1]--;
        }
        // 결과적으로 체육복 없는 학생을 검색하고, 여벌 체육복이 있는 사람이 전달할 수 있게
        for (int i = 0; i < student.length; i++) {
            if(student[i] == -1) {
                // 앞 학생에게 체육복 빌릴 수 있는 경우
                if(i != 0 && student[i - 1] == 1) {
                    student[i - 1]--;
                    student[i]++;
                } else if (i != student.length -1 && student[i + 1] == 1) {
                    // 뒷 학생에게 체육복 빌릴 수 있는 경우
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }
        for (int i = 0; i < student.length; i++) {
            if(student[i] >= 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
//        int n = 5;
//        int[] lost  = {2,4};
//        int[] reserve = {1,3,5};
//        int n = 5;
//        int[] lost  = {2,4};
//        int[] reserve = {3};
        int n = 4;
        int[] lost  = {2,3};
        int[] reserve = {3,4};

        int result = solution(n, lost, reserve);

        System.out.println(result);
    }
}
