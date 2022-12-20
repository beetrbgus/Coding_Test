package Programmers.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12917">문자열 내림차순으로 배치하기</a>
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class P_12917_SortDesc {
    /**
     * 문자를 받아서 char 배열로 만들고,
     * 정렬 시킨 후 역순으로 StringBuilder에 붙여준다.
     */
    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length-1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String solution = solution(s);
        System.out.println(solution);
    }
}
