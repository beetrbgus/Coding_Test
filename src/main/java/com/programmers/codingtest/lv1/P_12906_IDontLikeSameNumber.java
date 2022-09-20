package com.programmers.codingtest.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 배열 arr의 크기 : 1,000,000 이하의 자연수
 * 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 */
public class P_12906_IDontLikeSameNumber {
    /**
     * 가급적 Java의 Collection을 안쓰려고 하지만
     * ArrayList을 안 쓰면 arr과 같은 크기의 배열 arr2라고 가정하면 arr2를 만들고 옮겨 담은 후
     * arr2의 빈 공간을 없애기 위해 다시 옮겨 담아야해서 ArrayList를 사용했다.
     * 연속된 숫자가 들어오지 않으면 숫자를 filters에 추가 후 filteredArrIndex를 증가시켜줬는데,
     * 좀 불필요 한 것 같기도 하다.
     */
    public int[] solution(int[] arr) {
        List<Integer> filters = new ArrayList<>();
        int filteredArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int arrElement = arr[i];
            if (i == 0) {
                filters.add(arrElement);
                continue;
            }
            if(filters.get(filteredArrIndex) != arrElement) {
                filters.add(arrElement);
                filteredArrIndex++;
            }
        }
        int[]  filteredArr = new int[filters.size()];
        for (int i = 0; i < filters.size(); i++) {
            filteredArr[i] = filters.get(i);
        }
        return filteredArr;
    }

    /**
     * 좋아요가 가장 많은 문제 풀이 방법
     * 내가 푼 방법보다 효율적이라고 생각한다.
     * 이전 숫자를 변수로 만들어서 비교 후 이전 숫자를 현재 숫자로 변경해주기 때문에 깔끔하다라고 생각했다.
     * 나는 컬렉션을 조회해야하기 때문에 (ArrayList는 순서가 있어서 조회가 빠르긴하지만 이 방법보다는 무조건 느릴 것 같다.)
     * 불필요한 작업을 한 번 더 하는 꼴인 것 같다.
     */
    public int[] solution2(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }

        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }

    public static void main(String[] args) {
        P_12906_IDontLikeSameNumber iDontLikeSameNumber = new P_12906_IDontLikeSameNumber();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] solution = iDontLikeSameNumber.solution(arr);
        for (int element: solution) {
            System.out.println(element);
        }

    }
}
