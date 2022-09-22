package com.programmers.codingtest.lv1;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
 * solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 */
public class P_12910_DivideableNumberArr {
    /**
     * 오름차순으로 하기 위해서 TreeSet 사용.
     */
    public int[] solution(int[] arr, int divisor) {

        Set<Integer> dividableSet = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            int arrElement = arr[i];
            if(arrElement % divisor == 0) dividableSet.add(arrElement);
        }

        if(dividableSet.size() == 0) return new int[]{-1};
        int[] answer = new int[dividableSet.size()];

        Iterator<Integer> iterator = dividableSet.iterator();
        int index = 0 ;
        while(iterator.hasNext()) {
            answer[index] = iterator.next();
            index++;
        }
        return answer;
    }

    /**
     * 스터디원 효섭님 코드
     * 아래 solution3을 작성하신 정희님 코드와 비슷
     */
    public int[] solution2(int[] arr, int divisor) {

        int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).toArray();
        Arrays.sort(answer);
        if(answer.length <= 0) return new int[]{-1};
        return answer;
    }

    /**
     * 깔끔하다라고 생각하는 코드
     * 시간은 오래걸리지만 가독성이 좋음.
     */
    public int[] solution3(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(f -> f % divisor == 0).sorted().toArray();
        return (result.length == 0) ? new int[] { -1 } :  result;
    }

    public static void main(String[] args) {
        P_12910_DivideableNumberArr modableNumberArr = new P_12910_DivideableNumberArr();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        modableNumberArr.solution(arr,divisor);

    }
}
