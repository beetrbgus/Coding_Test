package Programmers.lv0;


import java.util.Arrays;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120902">문자열 계산하기</a>
 */
public class P_120902_문자열_계산하기 {
    public static int solution(String my_string) {
        String[] my_stringArr = my_string.split(" ");
        int answer = Integer.parseInt(my_stringArr[0]);
        for (int i = 1; i < my_stringArr.length - 1; i++) {
            if(my_stringArr[i].equals("+")) answer += Integer.parseInt(my_stringArr[i + 1]);
            else if(my_stringArr[i].equals("-")) answer -= Integer.parseInt(my_stringArr[i + 1]);
        }
        return answer;
    }

    /**
     * 프로그래머스 홍희표님 문제풀이
     * 만약 수식이 3 + 4 - 7 이라면 "- "를 "-"로 바꾸는 부분이 엄청 대단했다.
     * 바꾸게 되면 3 + 4 -7로 굳이 - 연산을 하지 않아도,
     * 더했을 때 음수로 되어 더하기만 하면 되기 때문이다.
     */
    public int streamSolution(String myString) {
        return Arrays.stream(
                myString.replaceAll("- ", "-")
                    .replaceAll("[+] ", "")
                    .trim()
                    .split(" ")
                )
                .mapToInt(Integer::parseInt)
                .sum();
    }
    public static void main(String[] args) {
        String my_string = "3 + 4 - 7";
        int result = solution(my_string);
        System.out.println(result);
    }
}
