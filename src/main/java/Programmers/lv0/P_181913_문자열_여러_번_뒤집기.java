package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181913">문자열 여러 번 뒤집기</a>
 */
public class P_181913_문자열_여러_번_뒤집기 {
    public static String solution(String my_string, int[][] queries) {
        StringBuilder myStringSb = new StringBuilder(my_string);
        StringBuilder appendSb = new StringBuilder();

        for (int i = 0; i < queries.length; i++) {
            int[] moveArr = queries[i];
            String reverse = appendSb.append(myStringSb.substring(moveArr[0], moveArr[1] + 1)).reverse().toString();
            myStringSb = myStringSb.replace(moveArr[0], moveArr[1] + 1, reverse);
            appendSb.delete(0, appendSb.length());
        }
        return myStringSb.toString();
    }
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3},{0,7},{5,9},{6,10}};
        String result = solution(my_string, queries);
        System.out.println(result);
    }
}
