package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181939">더 크게 합치기</a>
 */
public class P_181939_더_크게_합치기 {
    public static int solution(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        if(Integer.valueOf(aStr+bStr) > Integer.valueOf(bStr+aStr)) return Integer.valueOf(aStr+bStr);
        else return Integer.valueOf(bStr+aStr);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int result = solution(a, b);
        System.out.println(result);
    }
}
