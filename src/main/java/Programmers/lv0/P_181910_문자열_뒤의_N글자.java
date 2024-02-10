package Programmers.lv0;

public class P_181910_문자열_뒤의_N글자 {
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        String result = solution(my_string, n);
        System.out.println(result);
    }
}
