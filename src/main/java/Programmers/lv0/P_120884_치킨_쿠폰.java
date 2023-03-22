package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120884">치킨 쿠폰</a>
 */
public class P_120884_치킨_쿠폰 {
    public static int solution(int chicken) {
        int answer = 0;

        while(chicken/10 != 0) {
            int remainChicken = chicken % 10;
            answer += chicken / 10;
            chicken /= 10;
            chicken += remainChicken;
        }
        return answer;
    }
    public static void main(String[] args) {
        int chicken = 1081;
        int result = solution(chicken);
        System.out.println(result);
    }
}
