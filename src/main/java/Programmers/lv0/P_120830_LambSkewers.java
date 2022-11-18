package Programmers.lv0;

/**
 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
 * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
 * 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
 * return 하도록 solution 함수를 완성해보세요.
 */
public class P_120830_LambSkewers {
    public int solution(int n, int k) {
        int lambPrice = 12000;
        int drink = 2000;
        int service = (n / 10) * drink;
        int total = lambPrice * n + drink * k - service;
        return total;
    }

    public static void main(String[] args) {
        P_120830_LambSkewers compareTwoNumber = new P_120830_LambSkewers();
        int num1 = 10;
        int num2 = 3;
        int solution = compareTwoNumber.solution(num1, num2);
        System.out.println("solution    : " + solution);
    }
}
