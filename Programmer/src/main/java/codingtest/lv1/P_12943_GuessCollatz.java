package codingtest.lv1;

/**
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은,
 * 주어진 수가 1이 될 때까지 다음 작업을 반복하면,
 * 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 *
 * 예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
 * 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
 * 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
 *
 * 입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.
 */
public class P_12943_GuessCollatz {
    /**
     * int 형을 벗어나기 때문에 long 타입 변수에 담아서 실행.
     *
     */
    public int solution(int num) {
        int answer = 0;
        long numCopy = num;
        while(numCopy !=1){
            if(answer >=500) {
                answer = -1;
                break;
            }

            if(numCopy%2 == 0) {
                numCopy = numCopy/2;
            }else {
                numCopy = (numCopy * 3) + 1;
            }
            answer++;
        }
        return answer;
    }

    /**
     * 좋아요가 가장 많은 다른 사람의 풀이
     * 다른 점은 for문으로 500번만 실행함 ( loop 횟수가 정해진 반복문이라 for문을 써야겠음)
     * 삼항식을 사용해서 코드의 양을 줄였다.
     * if문과 else문이 명시적이긴하나 간단한 부분에서는 삼항식을 사용해도 좋을 것 같다.
     */
    public int solution2(int num) {
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        P_12943_GuessCollatz a = new P_12943_GuessCollatz();
        int n = 626331;

        System.out.println(a.solution(n));

    }
}
