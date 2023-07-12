package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181874">A 강조하기</a>
 */
public class P_181874_A_강조하기 {
    public static String solution(String myString) {
        return myString.toLowerCase().replace('a', 'A');
    }
    public static void main(String[] args) {
        String myString = "abstract algebra";
        String result = solution(myString);
        System.out.println(result);
    }
}
