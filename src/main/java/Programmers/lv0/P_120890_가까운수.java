package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120890">가까운 수</a>
 */
public class P_120890_가까운수 {
    /**
     * 가까운 수를 구하기 위해서 인덱스와 차를 담은 변수를 만들고
     * 분기로 더 차이가 작은 수가 나오면 갱신
     * 정렬을 사용하면 n이 10이고 array의 원소가 9 11일 때
     * 어떤 수가 작은지 구하는 로직을 안 짜도 되지만,
     * 쓰지 않고도 할 수 있기 때문에 그대로 짬
    */
    public static int solution(int[] array, int n) {
        int smallGapIndex = 0;
        int smallGap = Math.abs(n - array[0]);
        for (int i = 1; i < array.length; i++) {
            int gap = Math.abs(n - array[i]);
            if(gap < smallGap) {
                smallGapIndex = i;
                smallGap = gap;
            } else if (gap == smallGap) {
                if(array[i] < array[smallGapIndex]) {
                    smallGapIndex = i;
                    smallGap = gap;
                }
            }
        }
        return array[smallGapIndex];
    }
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int result = solution(array, n);
        System.out.println(result);
    }
}
