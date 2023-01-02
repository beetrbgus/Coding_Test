package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120887">K의 갯수</a>
 * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
 * 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 */
public class P_120887_KCount {
    public static int solution(int i, int j, int k) {
        // 자릿수에 해당 숫자가 있을 때
        // 5532
        int answer = 0;
        for(int z = i; z <=j; z++) {
            int temp = z;
            while(temp != 0) {
                if(k == temp%10) answer++;
                temp/=10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i, j, k));
    }
}
