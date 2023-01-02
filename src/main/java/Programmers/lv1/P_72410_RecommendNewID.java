package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/72410">신규 아이디 추천 </a>
 * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
 * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
 * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
 * 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
 *
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 */
public class P_72410_RecommendNewID {
    static StringBuilder sb = new StringBuilder();
    public static String solution(String new_id) {
        sb.append(new_id);
        level1();
        level2();
        level3();
        level4();
        level5();
        level6();
        level7();
        return sb.toString();
    }

    public static void level1() {
        String id = sb.toString();
        sb.replace(0, sb.length(), id.toLowerCase());
    }
    public static void level2() {
        char[] chars = sb.toString().toCharArray();
        sb.delete(0, sb.length());
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            boolean isAlphabet = aChar >= 97 && aChar <= 122;
            boolean isNumber = aChar >= 48 && aChar <= 57;
            boolean isAllowSpecial = aChar == '-' || aChar == '_' || aChar == '.';
            if(isAlphabet || isNumber) {
                sb.append(aChar);
            } else if (isAllowSpecial) {
                sb.append(aChar);
            }
        }
    }
    public static void level3() {
        char[] chars = sb.toString().toCharArray();
        sb.delete(0, sb.length());
        for (int i = 0; i < chars.length; i++) {
            if(i != 0) {
                if(chars[i-1] == '.' && chars[i] == '.') {
                    continue;
                }
            }
            sb.append(chars[i]);
        }
    }
    public static void level4() {
        if(sb.length() != 0 ) {
            if(sb.charAt(0) == '.') {
                sb.replace(0,1,"");
            }
            if (sb.length() != 0 && sb.charAt(sb.length()-1) == '.') {
                sb.replace(sb.length()-1,sb.length(),"");
            }
        }

    }
    public static void level5() {
        if(sb.length() == 0) {
            sb.append("a");
        }
    }
    public static void level6() {
        if(sb.length() >= 16) {
            sb.delete(15,sb.length());
        }
        if(sb.length() != 0) {
            if(sb.charAt(sb.length()-1) == '.') {
                sb.delete(sb.length()-1, sb.length());
            }
        }
    }

    private static void level7() {
        if(sb.length() <= 2 && sb.length() > 0) {
            while (sb.length() <= 2) {
                sb.append(sb.charAt(sb.length()-1));
            }
        }
    }

    public static void main(String[] args) {
        String newID = "...!@BaT#*..y.abcdefghijklm";
        String newID2 = "z-+.^.";
        String newID3 = "=.=";
        String newID4 = "123_.def";
        String newID5 = "abcdefghijklmn.p";

        System.out.println(solution(newID3));
    }
}
