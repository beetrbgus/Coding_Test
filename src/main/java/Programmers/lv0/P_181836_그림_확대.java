package Programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 */
public class P_181836_그림_확대 {
    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int answerIndex = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            for (int j = 0; j < k; j++) {
                answer[answerIndex] = sb.toString();
                answerIndex++;
            }
            sb.delete(0, sb.length());
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] picture = {
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."};
        int k = 2;
        String[] resultArr = solution(picture, k);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]);
            if(i % k - 1 == 0) System.out.println();
        }
    }
}
