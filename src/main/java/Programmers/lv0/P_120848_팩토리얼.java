package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120848?language=java">팩토리얼</a>
 */
public class P_120848_팩토리얼 {
    /**
     * n을 1부터 나누는데
     * 예를 들어 n이 3이라면 roopIndex가 2일 때 나눴을 때 1이 되고,
     * roopIndex가 3일 때 되지 않기 때문에 2! 가 답이 됨.
     * 때문에 나눈 값이 루프인덱스보다 작다면 멈춤
     *
     * @param n
     * @return
     */
    public static int solution(int n) {
        int roopIndex = 1;
        if(n == 1) return 1;
        do{
            n/= roopIndex;
            if(n < roopIndex) break;
            else roopIndex++;
        }while(n > 0);
        return roopIndex;
    }
    public static void main(String[] args) {
        int n = 3628800;
        int result = solution(n);
        System.out.println(result);
    }
}
