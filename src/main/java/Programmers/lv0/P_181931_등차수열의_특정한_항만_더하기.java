package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181931">등차수열의 특정한 항만 더하기</a>
 */
public class P_181931_등차수열의_특정한_항만_더하기 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i ++) {
            if(included[i]) answer += a + i * d;
        }
        return answer;
    }
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        int result = solution(a, d, included);
        System.out.println(result);
    }
}
