package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/142086">가장 가까운 같은 글자</a>
 */
public class P_142086_가장_가까운_같은_글자 {
    public static int[] solution(String s) {
        int alphabet = 'z' - 'a' + 1; // 알파벳 갯수
        int[] alphabetArr = new int[alphabet];
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            // 이미 알파벳이 전에 나왔으면 현재 인덱스에서 알파벳의 가장 뒤의 인덱스를 뺀 수 + 1 반환
            // 마지막에 +1을 하는 이유는 i가 0일 때 alphabetArr[index] = i 를 넣어버리면 다음 수도 0이 되어버려서 i+1를 담기 때문
            result[i] =  alphabetArr[index] != 0 ? i - alphabetArr[index] + 1 : -1;
            alphabetArr[index] = i + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "banana";
        String s2 = "aaabbbccc";
        int[] result = solution(s2);
        for (int num : result
             ) {
            System.out.print(num+ ", ");
        }
    }
}
