package Programmers.lv0;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120894">영어가 싫어요</a>
 */
public class P_120894_영어가_싫어요 {
    public static long solution(String numbers) {
        String[] numList = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numList.length; i ++) {
            numbers = numbers.replaceAll(numList[i], String.valueOf(i));
        }
        return Long.valueOf(numbers);
    }
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnineone";
        long result = solution(numbers);
        System.out.println(result);
        System.out.println(numbers.replace("one", "1"));
    }
}
