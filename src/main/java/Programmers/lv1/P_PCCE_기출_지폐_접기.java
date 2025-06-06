package Programmers.lv1;

/**
 * <a href=""></a>
 */
public class P_PCCE_기출_지폐_접기 {
    /**
     * 지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접음
     * 접기 전 길이가 홀수이면 접은 후 소수점 이하는 버림.
     * 접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접음
     *
     * @param wallet
     * @param bill
     * @return
     */
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            boolean toInWidth = wallet[0] >= bill[0] &&
                    wallet[1] >= bill[1];
            boolean toInHeight = wallet[0] >= bill[1] &&
                    wallet[1] >= bill[0];
            if(toInWidth || toInHeight) {
                break;
            } else {
                if(bill[0] > bill[1]) {
                    bill[0] /= 2;
                } else {
                    bill[1] /= 2;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] wallet = {30, 15};
//        int[] bill = {26, 17};
        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        int result = solution(wallet, bill);
        System.out.println(result);
    }
}
