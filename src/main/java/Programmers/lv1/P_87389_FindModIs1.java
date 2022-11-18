package Programmers.lv1;

/**
 * 자연수 n이 매개변수로 주어집니다.
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록
 * solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다다.
 * 3 ≤ n ≤ 1,000,000
 */
public class P_87389_FindModIs1 {
    /**
     * answer 초기 값을 2로 설정한 이유는
     * 1로 두면 무슨 수던지 나머지가 0이기 때문에 의미가 없고
     * n은 3 이상이기 때문에 answer를 2부터 잡았다.
     */
    public int solution(int n) {
        int answer = 2;

        while(true){
            if(n % answer == 1 ) {
                break;
            }
            answer++;
        }
        return answer;
    }

    /**
     * 좋아요가 두번째로 많은 다른 사람의 풀이 ( 첫번째는 스트림 )
     * 내가 쓴 코드와 크게 다른 부분이 없기 때문에 코멘트 생략하겠다.
     */
    public int solution2(int n) {
        int answer = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_87389_FindModIs1 a = new P_87389_FindModIs1();
        int n = 10;
        System.out.println(a.solution(n));
    }
}
