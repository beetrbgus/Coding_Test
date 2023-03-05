package Programmers.lv1;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/160586">대충 만든 자판</a>
 */
public class P_160586_대충_만든_자판 {
    /**
     * keymap[i]는 i + 1번 키를 눌렀을 때 순서대로 바뀌는 문자를 의미합니다
     * 예를 들어 keymap[0] = "ABACD" 인 경우
     * 1번 키를 한 번 누르면 A, 두 번 누르면 B, 세 번 누르면 A 가 됩니다.
     * 단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.
     */
    public static int[] solution(String[] keymap, String[] targets) {

        Map<String, Integer> keyMap = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                String keyChar = String.valueOf(key.charAt(j));
                Integer value = keyMap.get(keyChar);
                if(value == null) {
                    keyMap.put(keyChar, j + 1);
                }else {
                    if(j < value) {
                        keyMap.put(keyChar, j + 1);
                    }
                }
            }
        }
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String[] split = targets[i].split("");
            int pressCount = 0;
            for (int j = 0; j < split.length; j++) {
                Integer alphabetCount = keyMap.get(split[j]);
                if (alphabetCount == null) {
                    pressCount = -1;
                    break;
                }else {
                    pressCount += alphabetCount;
                }
            }
            answer[i] = pressCount;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        int[] result = solution(keymap, targets);
        for (int number : result) {
            System.out.println(number);
        }
    }
}
