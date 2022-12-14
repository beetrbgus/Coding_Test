package Programmers.lv1;

/**
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
 * 다르면 False를 return 하는 solution를 완성하세요.
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
 */
public class P_12916_NumberOfPAndY {

    boolean solution(String s) {
        char[] sArr = s.toCharArray();
        int[] numberOfPAndY  = new int[2];

        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i] == 'p' || sArr[i] == 'P') numberOfPAndY[0]++;
            if(sArr[i] == 'y' || sArr[i] == 'Y') numberOfPAndY[1]++;
        }
        return (numberOfPAndY[0] == numberOfPAndY[1]);
    }

    /**
     * 좋아요가 가장 많은 다른 사람의 풀이
     * 람다는 생각도 못했다. 하지만 코드는 짧은데 시간적인 효율성이 나쁘다.
     */
    boolean solution2(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    /**
     * 변수를 이 답안처럼 count로 비교했으면 더 빠르고 보기도 편했을 것 같다.
     * 마지막 return의 분기를
     * return (count== 0) 처럼 했으면 더 간결하고 좋지 않았을까 싶다.
     */
    boolean solution3(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        P_12916_NumberOfPAndY a = new P_12916_NumberOfPAndY();
        String s = "pPoooyY";
        System.out.println(a.solution(s));
    }
}
