package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181938">두 수의 연산값 비교하기</a>
 */
public class P_181938_두_수의_연산값_비교하기 {
    /**
     * 오답.
     * a의 맨앞자리가 b 보다 작으면  2 * a * b 이고 반대의 경우엔 a + b 이라고 가정.
     * 70퍼센트 정도는 맞지만, 아닌 부분이 있어서 오답
     */
    public static int wrongSolution(int a, int b) {
        int aFirst = Integer.parseInt(String.valueOf(String.valueOf(a).charAt(0)));
        int bFirst = Integer.parseInt(String.valueOf(String.valueOf(b).charAt(0)));
        return aFirst > bFirst ? Integer.parseInt(a + "" + b) : 2 * a * b;
    }
    public static int solution(int a, int b) {
        int APlusB = Integer.parseInt(a + "" + b);
        int other = 2 * a * b;
        return APlusB > other ? APlusB : other;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        int result = solution(a, b);
        System.out.println(result);
    }
}
