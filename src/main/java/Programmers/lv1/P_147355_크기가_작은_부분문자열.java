package Programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/147355">크기가 작은 부분 문자열</a>
 *
 */
public class P_147355_크기가_작은_부분문자열 {
    /**
     * t와 p는 int 타입을 넘을 수 있음. long 타입으로 받음.
     * 예를 들어 t = 3141592 (7자리)는 p = 271(3자리)일 때
     * t를 3자리로 나누는 경우는 314,141,415,159,592 5개가 나올 수 있음.
     * 다시 말해 t의 자리수 - p의 자리수 + 1만큼 나옴.
     * for문에서 0부터 시작하기 때문에 뒤의 +1은 제하고 생각.
     *
     * t에서 p자리만큼 문자를 자른 후 p와 비교해 작다면 정답에 1씩 추가.
     */
    public static int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long substring = Long.parseLong(t.substring(i, i + p.length()));
            if(substring <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
//        String t = "3141592";
//        String p = "271";
        String t = "500220839878";
        String p = "7";

        int result = solution(t, p);
        System.out.println(result);
    }

}
