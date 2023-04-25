package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120913">잘라서 배열로 저장하기</a>
 */
public class P_120913_잘라서_배열로_저장하기 {
    public static String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[length];
        int startIndex = 0;
        for (int i = 0; i < answer.length; i++) {
            if(i < answer.length - 1) answer[i] = my_str.substring(startIndex, startIndex + n);
            else  answer[i] = my_str.substring(startIndex, my_str.length());
            startIndex += n;
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        String[] result = solution(my_str, n);
        for (String resultIndex : result) {
            System.out.print( resultIndex + " ");
        }
    }
}
