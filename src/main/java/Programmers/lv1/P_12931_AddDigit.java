package Programmers.lv1;

public class P_12931_AddDigit {

    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer+= n%10;
            if(n/10 == 0) {
                break;
            }
            n= n/10;
        }

        return answer;
    }
    public static void main(String[] args) {
        P_12931_AddDigit a = new P_12931_AddDigit();
        a.solution(123);
    }
}
