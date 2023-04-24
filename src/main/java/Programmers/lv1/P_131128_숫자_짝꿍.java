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
    // Map을 사용하는 것보다 고정 배열을 선택하는 것이 훨씬 더 나음
    public static String solution2(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
            x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
            return "-1";
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else {
            return answer.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = "100";
        String Y = "203045";
        System.out.println("정답 : " + solution(X, Y));
    }
}
