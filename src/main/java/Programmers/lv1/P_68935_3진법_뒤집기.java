package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/68935">3진법 뒤집기</a>
 */
public class P_68935_3진법_뒤집기 {
    public static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 3);
            n/=3;
        }
        // 뒤집기
        String stringNumber = sb.toString();
        for (int i = 0; i < stringNumber.length(); i++) {
            int index = stringNumber.charAt(i) - '0';
            if(index == 0 ) continue;
            answer += index * Math.pow(3, stringNumber.length() - (i + 1));
        }
        return answer;
    }
    public static void main(String[] args) {
        int number = 45;
        int result = solution(number);
        System.out.println(result);
    }
}
