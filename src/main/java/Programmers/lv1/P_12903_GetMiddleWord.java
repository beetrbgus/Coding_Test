package Programmers.lv1;

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다
 */
public class P_12903_GetMiddleWord {
    /**
     * 홀수일 때는 가운데 인덱스
     * 짝수일 때는 앞자리 문자와 가운데 인덱스를 더함
     */
    public String solution(String s) {
        int sLength = s.length();
        String middleWord = String.valueOf(s.charAt(sLength/2));

        if(sLength % 2 == 1) return middleWord;
        else return s.charAt(sLength/2-1) + middleWord;
    }

    /**
     * 좋아요가 가장 많은 코드
     * 너무너무 깔끔하다. 습관처럼 분기처리만 하려는 것 반성하게 됨..
     * 공통점을 찾는게 중요하다라고 생각이 듦
     */
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    public static void main(String[] args) {
        P_12903_GetMiddleWord removeMinimumNumber = new P_12903_GetMiddleWord();
        String s = "abcde";
        removeMinimumNumber.solution(s);
    }
}
