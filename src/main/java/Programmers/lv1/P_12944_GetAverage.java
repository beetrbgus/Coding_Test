<<<<<<<< HEAD:src/main/java/Programmers/lv1/P_12944_GetAverage.java
package Programmers.lv1;
========
package codingtest.lv1;
>>>>>>>> origin/main:Programmer/src/main/java/codingtest/lv1/P_12944_GetAverage.java

/**
 *  평균 구하기
 */
public class P_12944_GetAverage {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        return answer/arr.length;
    }

    /**
     * 다른 점은 이분은 null 분기를 추가했다.
     * 궁금한 점은 null 분기를 2번 할거면 if else로 왜 쓰지 않았는지 개인적으로 궁금
     * 그 외는 더하는 것에 int를 사용해서 내가 덧셈에 쓴 double 보다 더 효율적인 것 같다.
     */
    public int getMean(int[] array) {
        if(array == null){
            return 0;
        }

        int ret = 0;
        if(array != null){
            for(int n : array){
                ret += n;
            }
        }
        return ret / array.length;
    }

    public static void main(String[] args) {
        P_12944_GetAverage a = new P_12944_GetAverage();
        int[] arr = {1, 2, 3, 4};
        System.out.println(a.solution(arr));
    }
}
