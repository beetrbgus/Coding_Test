package Programmers.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12939">최대값과 최소값</a>
 *
 */
public class P_12939_MaxAndMin {
    /**
     * 둘 이상의 정수가 있기 때문에
     * 최대, 최소값을 미리 초기화 해놓고
     * 수 비교해가면서 max, min을 구함.
     */
    public static String solution(String s) {
        String[] sArr= s.split(" ");
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);
        for (int i = 0; i < sArr.length; i++) {
            int now = Integer.parseInt(sArr[i]);
            if(max < now) max = now;
            if(min > now) min = now;
        }
        return min + " " + max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
