package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181837">커피 심부름</a>
 */
public class P_181837_커피_심부름 {
    public static int solution(String[] order) {
        int answer = 0;
        for (String menu : order) {
            if(menu.contains("americano") || menu.contains("anything")) answer += 4500;
            else answer += 5000;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int result = solution(order);
        System.out.println(result);
    }
}
