package Programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/131128?language=java">숫자 짝꿍</a>
 *
 */
public class P_131128_숫자_짝꿍 {
    public static String solution(String X, String Y) {
        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();
        Map<Character, Integer> sameNumberMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int moreLongLength = X.length() > Y.length()? X.length() : Y.length();
        int XLength = X.length();
        int YLength = Y.length();
        for (int i = 0; i < moreLongLength; i++) {
            if(i < XLength) {
                char xChar = X.charAt(i);
                Integer xMapCount = xMap.getOrDefault(xChar, 0);
                xMap.put(xChar, ++xMapCount);
            }
            if(i < YLength) {
                char yChar = Y.charAt(i);
                Integer yMapCount = yMap.getOrDefault(yChar, 0);
                yMap.put(yChar, ++yMapCount);
            }
        }
        // 공통 숫자 합치기
        for (int i = 0; i < 10; i++) {
            Character index = Character.valueOf((char)('0' + i));
            Integer xMapCount = xMap.getOrDefault(index, 0);
            Integer yMapCount = yMap.getOrDefault(index, 0);
            // 둘 중 하나가 0이라면 공통 숫자가 아님
            if(xMapCount == 0 || yMapCount == 0) continue;
            int sameMinCount = xMapCount > yMapCount ? yMapCount : xMapCount;
            sameNumberMap.put(Character.forDigit(i, 10), sameMinCount);
        }
        // 공통숫자에서 큰 수 기반으로 하기
        for (int i = 9; i >= 0; i--) {
            Integer sameNumber = sameNumberMap.getOrDefault(Character.forDigit(i, 10), 0);
            if(sameNumber == 0) continue;
            for (int j = 0; j < sameNumber; j++) {
                sb.append(i);
                // 00 처럼 0만 있는 숫자들은 0으로 반환해야 함.
                if(sb.length() == 1 && i == 0) break;
            }
        }
        return sb.toString().length() !=0 ? sb.toString() : "-1";
    }
    // 공통적으로 나타나는 숫자 구하기
    public static void commonNumber(char[] xArr, char[] yArr) {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = "100";
        String Y = "203045";
        System.out.println("정답 : " + solution(X, Y));
    }
}
