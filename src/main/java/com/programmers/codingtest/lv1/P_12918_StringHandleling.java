package com.programmers.codingtest.lv1;

/**
 * 문자열 s의 길이가 4 혹은 6이고,
 * 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class P_12918_StringHandleling {
    /**
     * 문자열 길이 제한 조건문
     * 문자열의 구성이 숫자인지 조건문으로 풂
     */
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            char[] sCharArr = s.toCharArray();

            for(int i = 0; i<sCharArr.length; i++) {
                int arrToInt = sCharArr[i];
                if(arrToInt < 48 || arrToInt > 57) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * 신박한 풀이인 것 같다.
     * 숫자로 변환할 수 있으면 애초에 0-9 사이의 문자열이니까 true, 오류가 난다면 false
     */
    public boolean solution2(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
    public static void main(String[] args) {
        P_12918_StringHandleling stringHandleling = new P_12918_StringHandleling();
        String stringInput = "a234";
        stringHandleling.solution(stringInput);
    }
}
