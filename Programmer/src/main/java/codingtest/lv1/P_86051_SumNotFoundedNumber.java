package codingtest.lv1;

/**
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P_86051_SumNotFoundedNumber {
    /**
     * 1 ~ 9 중 없는 숫자를 더함 -> 1 ~ 9를 더한 값 중 없는 숫자를 뺌
     */
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i = 0; i < numbers.length; i ++) {
            answer -= numbers[i];
        }
        return answer ;
    }

    /**
     * 좋아요 가장 많은 문제 풀이는 위의 코드와 같기에 넘김.
     */

    public static void main(String[] args) {
        P_86051_SumNotFoundedNumber foundedNumber = new P_86051_SumNotFoundedNumber();
        int[] numbers = {1,2};
        foundedNumber.solution(numbers);
    }
}
