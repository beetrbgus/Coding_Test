package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/68644">두개 뽑아서 더하기</a>
 *
 */
public class P_68644_두개_뽑아서_더하기 {
    /**
     * Set을 쓰면 편하게 할 수 있지만 Collection을 사용하지 않고 풀고 싶었음.
     * 숫자는 총 100개, 100이하의 숫자니까 두개 더한 것은 최대 200이라
     * 더한 값을 담을 배열을 200개로 초기화.
     * 더한 값을 배열에 담고
     * 합산이 끝나면 옮겨 닮음
     */
    public static int[] solution(int[] numbers) {
        int[] sumArr = new int[200];
        int sumArrLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(sumArr[numbers[i]+ numbers[j]] == 0) {
                    sumArr[numbers[i]+ numbers[j]]++;
                    sumArrLength ++;
                }
            }
        }
        int[] result = new int[sumArrLength];
        int index = 0;
        for (int i = 0; i < sumArr.length; i++) {
            if(sumArr[i] >= 1) {
                result[index] = i;
                index ++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] solution = solution(numbers);
        for (int answer : solution) {
            System.out.println(answer);
        }

    }
}
