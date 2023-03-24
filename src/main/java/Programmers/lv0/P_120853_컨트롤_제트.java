package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120853">컨트롤 제트</a>
 */
public class P_120853_컨트롤_제트 {
    public static int solution(String input) {
        int answer = 0;
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            if(inputArr[i].equals("Z")) {
                answer -= Integer.parseInt(inputArr[i-1]);
                continue;
            }
            answer += Integer.parseInt(inputArr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        int result = solution(s);
        System.out.println(result);
    }
}
