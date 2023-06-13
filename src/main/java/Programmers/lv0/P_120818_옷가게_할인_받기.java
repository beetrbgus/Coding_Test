package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120818">옷가게 할인 받기</a>
 */
public class P_120818_옷가게_할인_받기 {
    public static int solution(int price) {
        if(price >= 500000) return (int)(price * 0.8);
        else if (price >= 300000) return (int)(price * 0.9);
        else if (price >= 100000) return (int)(price * 0.95);
        else return price;
    }
    public static void main(String[] args) {
        int price = 150000;
        int result = solution(price);
        System.out.println(result);
    }
}
