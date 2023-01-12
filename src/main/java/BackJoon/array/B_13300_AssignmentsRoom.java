package BackJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/13300">방 배정</a> <br>
 * 남학생은 남학생끼리, 여학생은 여학생끼리 방을 배정해야 한다. <br>
 * 또한 한 방에는 같은 학년의 학생들을 배정해야 한다. <br>
 * 물론 한 방에 한 명만 배정하는 것도 가능하다. <br>
 *
 * 한 방에 배정할 수 있는 최대 인원 수 K가 주어졌을 때, <br>
 * 조건에 맞게 모든 학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램을 작성하시오.<br>
 *
 * 예를 들어, 수학여행을 가는 학생이 다음과 같고 K = 2일 때 12개의 방이 필요하다. <br>
 * 왜냐하면 3학년 남학생을 배정하기 위해 방 두 개가 필요하고 4학년 여학생에는 방을 배정하지 않아도 되기 때문이다. <br>
 *
 * 학년	여학생	    남학생
 * 1학년	영희	        동호, 동진
 * 2학년	혜진, 상희	경수
 * 3학년	경희	        동수, 상철, 칠복
 * 4학년	            달호
 * 5학년	정숙	        호동, 건우
 * 6학년	수지	        동건
 *
 * 표준 입력으로 다음 정보가 주어진다. <br>
 * 첫 번째 줄 : 수학여행에 참가하는 학생 수 = 정수 N(1 ≤ N ≤ 1,000) ,한 방의 최대 인원 수 K(1 < K ≤ 1,000) 공백으로 분리. <br>
 * 다음 N개 줄 : 학생의 성별 S와 학년 Y(1 ≤ Y ≤ 6)가 공백으로 분리되어 주어진다. <br>
 * 성별 S = 여학생인 경우에 0, 남학생인 경우에 1 <br>
 */
public class B_13300_AssignmentsRoom {
    /**
     * 학년 : 1 - 6학년 = 6개
     * 남자와 여자방 분리해야 하기 때문에 배열 따로 생성.
     * 입력받은 학생의 성별 정보로 계산
     * 딱 나누어 떨어질 때 해당 학년의 필요한 방 수 = 학생인원 / 방 인원
     * 딱 나누어 떨어지지 않을 때 해당 학년 필요한 방 수 = 학생인원 / 방 인원 + 1 (어차피 모자른 인원은 방 한개를 더 써야 함)
     *
     * 총 방 수이기 때문에 여자와 남자 필요 방수를 모두 더해준다.
     */
    static int gradeCount = 6;
    static int[] women = new int[gradeCount];
    static int[] men = new int[gradeCount];
    public static int solution(int K) {
        int room = 0;
        for (int i = 0; i < gradeCount; i++) {
            int womenRoom = women[i] % K == 0 ? women[i] / K : women[i] / K + 1;
            int menRoom = men[i] % K == 0 ? men[i] / K : men[i] / K + 1;
            room += womenRoom + menRoom;
        }
        return room;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            String[] student = br.readLine().split(" ");
            int gender = Integer.parseInt(student[0]);
            int grade = Integer.parseInt(student[1]);
            if(gender == 0) {
                women[grade - 1]++;
            }else if(gender == 1){
                men[grade - 1]++;
            }
        }
        System.out.println(solution(K));
    }
}
