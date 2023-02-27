package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120812">최빈값 구하기</a>
 */
public class P_120812_최빈값_구하기 {
    public static int solution(int[] array) {
        int[] appearCount = new int[1000];
        int maxNumber = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int arrayNumber = array[i];
            appearCount[arrayNumber] ++;

            if(appearCount[arrayNumber] > maxNumber) {
                maxNumber = appearCount[arrayNumber];
            }
        }
        int count = 0;
        for (int i = 0; i < appearCount.length; i++) {
            if(maxNumber == appearCount[i]) {
                count ++;
                maxIndex = i;
            }
            if(count >= 2) return -1;
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        int result = solution(array);
        System.out.println(result);
    }
}

