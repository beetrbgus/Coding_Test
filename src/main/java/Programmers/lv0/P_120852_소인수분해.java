package Programmers.lv0;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120852">소인수분해</a>
 */
public class P_120852_소인수분해 {
    public static int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n != 1) set.add(n);

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    public static void main(String[] args) {
        int n = 420;
        int[] result = solution(n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}