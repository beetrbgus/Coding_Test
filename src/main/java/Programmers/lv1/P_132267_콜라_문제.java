package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/132267">콜라 문제</a>
 * giveEmptyBottle : 콜라 받기 위해 마트에 주어야 하는 병 수
 * exchangeNewCola : 빈병 giveEmptyBottle개를 갖다주면 마트에서 주는 새 콜라 병 수
 * havingEmptyBottle : 가지고 있는 빈 병의 수
 *
 * answer += (havingEmptyBottle / giveEmptyBottle) * exchangeNewCola
 */
public class P_132267_콜라_문제 {
    static int answer = 0;

    /**
     * 재귀 방식으로 풀기
     */
    public static int solution(int giveEmptyBottle, int exchangeNewCola, int havingEmptyBottle) {
        recursion(giveEmptyBottle, exchangeNewCola, havingEmptyBottle);
        return answer;
    }
    public static void recursion(int giveEmptyBottle, int exchangeNewCola, int havingEmptyBottle) {
        if(giveEmptyBottle > havingEmptyBottle) return;
        int newCola = (havingEmptyBottle / giveEmptyBottle) * exchangeNewCola;
        answer += newCola;
        recursion( giveEmptyBottle, exchangeNewCola, (havingEmptyBottle % giveEmptyBottle) + newCola);
    }
    public static void main(String[] args) {
        int giveEmptyBottle = 2;
        int exchangeNewCola = 1;
        int havingEmptyBottle = 20;
        recursion(giveEmptyBottle, exchangeNewCola, havingEmptyBottle);
        System.out.println(answer);
    }
}
