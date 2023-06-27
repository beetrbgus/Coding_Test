package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181943">문자열 겹쳐쓰기</a>
 */
public class P_181943_문자열_겹쳐쓰기 {
    public static String solution(String my_string, String overwrite_string, int s) {
        return new StringBuilder(my_string)
                .replace(s, s + overwrite_string.length(), overwrite_string)
                .toString();
    }
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        String result = solution(my_string, overwrite_string, s);
        System.out.println(result);
    }

}
