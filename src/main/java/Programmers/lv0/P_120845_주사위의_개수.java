package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120845">주사위의 개수</a>
 */
public class P_120845_주사위의_개수 {
    /**
     * @param box 가로,세로,높이 저장 배열
     * @param n 모서리의 길이
     * @return
     */
    public static int solution(int[] box, int n) {
        /**
         * 주사위 길이가 3일때 들어갈 수 있는 갯수는 8처럼 남는 숫자는 2개 밖에
         * 못넣기 때문에 몫을 기준으로 곱해 줌. */
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
    public static void main(String[] args) {
        int[] box = {1, 1, 1};
        int n = 1;
        System.out.println(solution(box, n));

        int[] box2 = {10, 8, 6};
        int n2 = 3;
        System.out.println(solution(box2, n2));
    }
}
