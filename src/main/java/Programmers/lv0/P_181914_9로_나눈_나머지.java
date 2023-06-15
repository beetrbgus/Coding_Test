package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181914">9로 나눈 나머지</a>
 */
public class P_181914_9로_나눈_나머지 {
    public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }
    public static void main(String[] args) {
        String number = "123";
        int result = solution(number);
        System.out.println(result);
    }
}
