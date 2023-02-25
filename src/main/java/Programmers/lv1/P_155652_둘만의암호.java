package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/155652">둘만의 암호</a>
 */
public class P_155652_둘만의암호 {
    /**
     * 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줌
     * 알파벳이 z를 넘어갈 때 다시 a로 돌아감
     * skip에 있는 알파벳은 제외하고 건너 뜀
     */
    static int skipIndex;
    static String skipArr;
    public static String solution(String words, String skip, int index) {
        skipIndex = index;
        skipArr = skip;

        char[] wordsArr = words.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsArr.length; i++) {
            sb.append(skipWord(wordsArr[i]));
        }
        return sb.toString();
    }
    public static char skipWord(char word) {
        for (int i = 0; i < skipIndex; i++) {
            // 더한 값이 배열에 포함되어 있으면 넘겨야 함.
            do {
                word += 1;
                if(word > 'z') word = 'a';
            }
            while (skipArr.contains(String.valueOf(word)));
        }
        return word;
    }
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String solution = solution(s, skip, index);
        System.out.println(solution);
    }
}
