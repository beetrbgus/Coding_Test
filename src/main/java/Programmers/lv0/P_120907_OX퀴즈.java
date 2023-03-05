package Programmers.lv0;

import java.util.StringTokenizer;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120907">OX퀴즈</a>
 */
public class P_120907_OX퀴즈 {
    /**
     * 연산 기호와 숫자 사이는 항상 공백이 존재 , 음수는 띄어쓰기 없음
     * 그러면 띄어쓰기를 기준으로 나누면 될 듯
     */
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] mathExpression = quiz[i].split(" ");
            int firstNumber = Integer.parseInt(mathExpression[0]);
            String sign = mathExpression[1];
            int secondNumber = Integer.parseInt(mathExpression[2]);
            int result = Integer.parseInt(mathExpression[4]);
            int calculated = calculate(firstNumber, sign, secondNumber);
            answer[i] = result == calculated ? "O" : "X";
        }
        return answer;
    }
    public static int calculate(int firstNumber, String sign, int secondNumber) {
        if(sign.equals("+")) return firstNumber + secondNumber;
        else return firstNumber - secondNumber;
    }
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] result = solution(quiz);
        for (String resultIndex: result) {
            System.out.println(resultIndex);
        }
    }
}
