package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/77884">약수의 개수와 덧셈</a>
 */
public class P_77884_약수의_개수와_덧셈 {
    public static int solution(int left, int right) {
        int totalSum = 0;
        for (int i = left; i <= right; i++) {
            // i가 1인경우를 제외하고는 항상 약수가 짝수
            int measureCount = i==1? 1 : 0;

            //약수 갯수 구하기
            for (int j = 2; j < i; j++) {
                if(i % j == 0) measureCount ++;
            }
            if(measureCount % 2  == 0) {
                totalSum += i;
            }else {
                totalSum -= i;
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int result = solution(left, right);
        System.out.println(result);

        int left2 = 1;
        int right2 = 2;
        int result2 = solution(left2, right2);
        System.out.println(result2);
    }
}
