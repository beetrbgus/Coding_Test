package codingtest.lv1;

/**
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.
 * a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 *
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 */
public class P_70128_DotProduct {
    /**
     * 문제 설명과 동일한 방법으로 풂.
     */
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i< a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    /**
     * 좋아요 상위 두번째
     * 코드가 똑같아서...딱히 설명할 부분이 없다.
     */
    public int solution2(int[] a, int[] b) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+= a[i]*b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        P_70128_DotProduct dotProduct = new P_70128_DotProduct();
        int[] inputA = {1, 2, 3, 4};
        int[] inputB = {-3, -1, 0, 2};
        dotProduct.solution(inputA, inputB);
    }
}
