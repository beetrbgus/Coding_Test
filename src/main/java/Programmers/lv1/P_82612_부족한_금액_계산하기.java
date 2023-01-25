package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/82612">부족한 금액 계산하기</a>
 */
public class P_82612_부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        // int로 처리하면 범위 넘어가는 경우가 발생해서 long으로 처리
        long answer = price;
        for(int i = 1; i < count; i ++) {
            answer += price * (i+1);
        }
        return answer - money > 0 ? answer - money : 0 ;
    }
}
