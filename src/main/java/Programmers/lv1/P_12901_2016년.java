package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12901">2016년</a>
 * 2016년 1월 1일 = 금요일
 * 2016년 X월 X일은 무슨요일?
 */
public class P_12901_2016년 {
    static String[]  DAYS = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    static int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

    public static String solution(int a, int b) {
        int day = 0;
        for(int i = 1; i < a; i++) {
            day += month[i-1];
        }
        day += b - 1;
        return DAYS[day % 7 ];
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(5, 24));
    }
}
