package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181902">문자 개수 세기</a>
 */
public class P_181902_문자_개수_세기 {
    public static int[] solution(String my_string) {
        int alphabetCount = 'z' - 'a' + 1;
        int[] answer = new int[alphabetCount * 2];
        for (int i = 0; i < my_string.length(); i++) {
            char charAt = my_string.charAt(i);
            if(charAt >= 'a' && charAt <= 'z') answer[alphabetCount + charAt - 'a']++;
            else answer[charAt - 'A']++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "Programmers";
        int[] resultArr = solution(my_string);
        for (int result: resultArr) {
            System.out.println(result);
        }
    }
}
