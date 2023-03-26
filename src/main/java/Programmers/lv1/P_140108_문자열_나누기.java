package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/140108">문자열 나누기</a>
 */
public class P_140108_문자열_나누기 {
    public static int solution(String s) {
        char firstChar = s.charAt(0);
        int firstCharCount = 0;
        int anotherCount = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstCharCount == anotherCount) {
                result++;
                firstChar = s.charAt(i);
            }
            if (s.charAt(i) == firstChar) firstCharCount++;
            else anotherCount++;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "banana";
        int result = solution(s);
        System.out.println(result);
    }
}
