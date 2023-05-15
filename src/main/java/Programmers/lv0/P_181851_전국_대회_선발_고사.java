package Programmers.lv0;


import java.util.Map;
import java.util.TreeMap;

/**
 *<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181851">전국 대회 선발 고사</a>
 */
public class P_181851_전국_대회_선발_고사 {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> rankMap = new TreeMap<>();
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i]) {
                rankMap.put(rank[i], i);
            }
        }
        int plus = 10000;
        int numCount = 0;
        for (Integer az: rankMap.keySet()) {
            Integer index = rankMap.get(az);
            if(numCount < 3) {
                answer += plus * index;
                plus /= 100;
            }
            else break;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int result = solution(rank, attendance);
        System.out.println(result);
    }
}
