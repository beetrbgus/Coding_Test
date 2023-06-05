package Programmers.lv0;

public class P_181871_문자열이_몇_번_등장하는지_세기 {
    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String substring = myString.substring(i, i + pat.length());
            boolean equals = substring.equals(pat);
            if(equals) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        int result = solution(myString, pat);
        System.out.println(result);
    }
}
