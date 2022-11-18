package codingtest.lv0;

/**
 * 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
 * 각 angle이 매개변수로 주어질 때
 * 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
 *
 * 예각 : 0 < angle < 90
 * 직각 : angle = 90
 * 둔각 : 90 < angle < 180
 * 평각 : angle = 180
 */
public class P_120829_Protractor {
    /**
     * 공통점
     * 90으로 나눠 떨어지는 각은 2,4
     * 나눠 떨어지지 않는 각은 1,3
     */
    public int solution(int angle) {
        int mod = angle / 90;
        if(angle % 90 == 0) return mod * 2;
        else return mod * 2 + 1;
    }

    public static void main(String[] args) {
        P_120829_Protractor protractor = new P_120829_Protractor();
        int angle = 40;
        int solution = protractor.solution(angle);
        System.out.println("solution    : " + solution);
    }
}
