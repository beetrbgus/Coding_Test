package codingtest.lv0;

/**
 문자열 my_string이 매개변수로 주어집니다.
 my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
 return하도록 solution 함수를 완성해주세요.

 제한 사항

 1. 1 ≤ my_string ≤ 110
 2. my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
 3. 대문자와 소문자를 구분합니다.
 4. 공백(" ")도 하나의 문자로 구분합니다.
 5. 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
 */
public class P_120888_RemoveDuplicatedChar {
    public String solution(String my_string) {
        /**
         * 문자를 한 단어로 쪼개서 char 배열을 만든다.
         * 정답을 반환할 stringBuilder 생성.
         * stringBuilder에 my_String의 0번째 부터 반복한다.
         * 반복하면서 stringBuilder에 my_String의 i번째 문자가 있는지 확인하고
         * 없다면 해당 문자를 추가한다.
         * 반환한다.
        * */
        StringBuilder stringBuilder = new StringBuilder();
        char[] myStringcharArr = my_string.toCharArray();

        for (int i = 0; i < myStringcharArr.length; i++) {
            String my_StringOfI = String.valueOf(myStringcharArr[i]);

            if(!stringBuilder.toString().contains(my_StringOfI)) {
                stringBuilder.append(my_StringOfI);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 다른 사람의 풀이.
     * my_String.indexOf에 i번째 char를 넣으면 두개일 때에도 앞의 인덱스를 반환하기 때문에 내가 푼 방법보다 효율적이라고 생각한다.
     */
    public String solution2(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            //my_string.indexOf(my_string.charAt(i));
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P_120888_RemoveDuplicatedChar removeDuplicatedChar = new P_120888_RemoveDuplicatedChar();
        String my_String = "We are the world";
        String solution = removeDuplicatedChar.solution(my_String);
        System.out.println("solution    : " + solution);
    }
}
