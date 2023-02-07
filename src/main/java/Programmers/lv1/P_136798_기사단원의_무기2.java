package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/136798">기사단원의 무기</a>
 *
 */
public class P_136798_기사단원의_무기2 {
    // 1~ number까지 번호
    // 번호의 약수갯수에 해당하는 공격력
    // 약수 갯수가 많아도 limit보다 클 수 없음
    // 공격력 1당 1kg 철 필요
    // 무기 구매하는데 필요한 공격력
    public static int solution(int number, int limit, int power) {

        int answer = 0;
        int[] powerArr = new int[number];
        // 공격력 측정하기
        for(int i = 1; i <= number; i ++) {
            int attackPower = 0;
            for (int j = 1; j * j <= i; j++) {
                /**
                 * j 가 i의 약수일 때 i / j가 다른 약수가 됨.
                 * i = 6이라면 약수는 1,2,3,6 총 4개
                 * j는 1,2 두번 돌 것임
                 * j가 1일 때 나머지 약수가 6이기 때문에
                 * 2개를 더해 줌
                 * 만약 i = 4 일 때에는
                 * 2 * 2 = 4 이기 때문에
                 * 제곱근의 수가 약수가 됨
                 */
                if(j * j == i) {
                    attackPower++;
                }
                else if(i % j == 0) {
                    attackPower+=2;
                }
            }
            powerArr[i-1] = attackPower;
        }
        // 규약 체크
        for (int i = 0; i < powerArr.length; i++) {
            if(powerArr[i] > limit) {
                powerArr[i] = power;
            }
            answer+= powerArr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number, limit, power));
    }
}
