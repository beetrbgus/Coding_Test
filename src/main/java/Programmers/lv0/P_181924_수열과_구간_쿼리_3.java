package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181924">수열과 구간 쿼리 3</a>
 */
public class P_181924_수열과_구간_쿼리_3 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int[] result = solution(arr, queries);
        for (int answer : result) {
            System.out.println(answer);
        }
    }
}
