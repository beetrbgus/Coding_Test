package com.programmers.codingtest.lv1;

/**
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 *
 */
public class P_12935_RemoveMinimumNumber {
    /**
     * 최저값을 구한다. ( 배열은 길이가 1 이상이기 때문에 초기값을 애초에 arr의 0번째로 잡음.)
     * 최저값과 같은 것은 넘어가고 다른 것들을 배열에 넣어준다.
     */
    public int[] solution(int[] arr) {
        int minNumber = arr[0];
        int arrLength = arr.length;

        if(arrLength == 1) return new int[]{-1};

        for (int i = 1; i < arrLength; i++) {
            if(minNumber > arr[i]) minNumber = arr[i];
        }

        int[] answer = new int[arrLength-1];
        int answerIndex = 0;

        for (int i = 0; i < arrLength; i++) {
            if(minNumber == arr[i]) continue;
            else {
                answer[answerIndex] = arr[i];
                answerIndex++;
            }
        }

        return answer;
    }

    /**
     * 좋아요 2번쨰로 많은 코드
     * 시간 복잡도에서는 for문 3개여도 O(n)이지만
     * 무엇을 하고 싶은지 가독성이 떨어지는 것 같다.
     */
    public int[] solution2(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12935_RemoveMinimumNumber removeMinimumNumber = new P_12935_RemoveMinimumNumber();
        int[] arr = {4, 1, 2, 3};
        removeMinimumNumber.solution(arr);
    }
}
