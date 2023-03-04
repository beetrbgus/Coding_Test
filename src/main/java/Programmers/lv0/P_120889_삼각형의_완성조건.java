package Programmers.lv0;

import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120889">삼각형의 완성조건 (1)</a>
 */
public class P_120889_삼각형의_완성조건 {
    /**
     * 삼각형을 만들 수 있는 조건은 아래와 같다
     * -> 가장 긴 변의 길이(M) < 다른 두 변의 길이의 합(A)
     *
     * 다른 두변의 길이의 합 = 세변 모두의 합(S) - 가장 긴 변의 길이(M)
     * 그럼 대입시켜보면
     * M < S - M
     * 2M < S 이라면 삼각형을 만들 수 있음
     *
     * 삼각형 만들 수 있으면 1 아니면 2 return
     */
    public static int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            int side = sides[i];
            sum += side;
            if(max < side) max = side;
        }
        return sum > 2 * max ? 1 : 2;
    }
    public static int useStream(int[] sides) {
        int maxSide = Arrays.stream(sides).max().orElse(0);
        return Arrays.stream(sides).sum() > 2 * maxSide ? 1 : 2;
    }
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        int result = solution(sides);
        System.out.println(result);
        System.out.println();

        int[] sides2 = {1, 1, 1};
        int result2 = solution(sides2);
        System.out.println(result2);
        System.out.println();

        int[] sides3 = {199, 72, 222};
        int result3 = solution(sides3);
        System.out.println(result3);
        System.out.println();

    }
}