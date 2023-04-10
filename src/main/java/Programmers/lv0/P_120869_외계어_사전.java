package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120869">외계어 사전</a>
 */
public class P_120869_외계어_사전 {
    /**
     * 알파벳 담긴 배열 spell
     * 외계어 사전 dic
     * spell에 담긴 알파벳 한번씩만
     */
    public static int solution(String[] spell, String[] dic) {
        boolean isAnswer = false;
        for (int i = 0; i < dic.length; i++) {
            if(dic[i].length() == spell.length) {
                for (String spellChar : spell) {
                    if(dic[i].contains(spellChar)) dic[i] = dic[i].replaceFirst(spellChar, "");
                    else continue;
                }
                if(dic[i].equals("")) {
                    isAnswer = true;
                    break;
                }
            }
        }
        return isAnswer? 1 : 2;
    }
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        int result = solution(spell, dic);
        System.out.println(result);

    }
}
