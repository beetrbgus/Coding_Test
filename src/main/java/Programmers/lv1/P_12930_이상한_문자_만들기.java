package Programmers.lv1;

/**
 * <a href="https://https://school.programmers.co.kr/learn/courses/30/lessons/12930">이상한 문자 만들기</a>
 */
public class P_12930_이상한_문자_만들기 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        for(int i=0;i<sArr.length;i++) {
            char[] sCharArr = sArr[i].toCharArray();

            for(int j=0;j<sCharArr.length;j++) {
                char sChar = sCharArr[j];
                boolean isLower = sChar >= 'a';
                if(j%2==0) {
                    if(isLower) {
                        sChar -= 32;
                    }
                }else {
                    if(!isLower) {
                        sChar += 32;
                    }
                }
                sb.append(sChar);
            }
            if(i < sArr.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
