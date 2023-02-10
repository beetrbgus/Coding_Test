package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/81301">숫자 문자열과 영단어</a>
 *
 */
public class P_81301_숫자_문자열과_영단어 {

    public static int solution(String s) {
        String[] numberEng = {
                "zero", "one", "two",
                "three", "four", "five",
                "six", "seven", "eight", "nine"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char sCharAt = s.charAt(i);
            // 입력값이 숫자면 그냥 추가
            if(sCharAt >= '0' && s.charAt(i) <= '9') {
                sb.append(sCharAt);
            }else {
                // 입력값이 영어면 바꿔서 추가
                for (int j = 0; j < numberEng.length; j++) {
                    // 해당 영어의 길이 + 현재 s의 인덱스가 S보다 작아야 IndexOutOfBounds가 안 남.
                    if(numberEng[j].length() + i  <= s.length()) {
                        // s에서 영어숫자만큼의 길이를 잘라낸 값이 현재 numberEng와 같다면 추가
                        if(s.substring(i, i + numberEng[j].length()).equals(numberEng[j])) {
                            sb.append(j);
                            i+= numberEng[j].length()-1;
                            break;
                        }
                    }
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * 다른 사람의 풀이.
     * 깔끔하고 보기 좋게 짰다.
     * replace를 이용해 영문숫자를 숫자로 바꿔 줌.
     */
    public int solution2(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
