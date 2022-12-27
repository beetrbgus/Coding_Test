package Programmers.lv1;

/**
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때,
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
 * solution을 완성해주세요.
 */
public class P_12948_HidePhoneNumber {
    /**
     * repeat은 Java 11 부터 가능한 함수.
     *
     */
    public String solution(String phone_number) {
        int phoneNumberLength = phone_number.length();
        return "*".repeat(phoneNumberLength-4)
                + phone_number.substring(phoneNumberLength-4, phoneNumberLength);
    }

    /**
     * 좋아요가 가장 많은 문제 풀이
     * 휴대폰 번호를 받아 String을 char 배열로 만들고 던져 줌.
     * 엄청 효율적이다라고 생각함.
     */
    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        P_12948_HidePhoneNumber hidePhoneNumber = new P_12948_HidePhoneNumber();
        String phone_number = "01033334444";
        System.out.println(hidePhoneNumber.solution(phone_number));
    }
}
