package Programmers.lv0;

public class P_120809_배열_두배_만들기 {
    public static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = solution(numbers);
        for (int content : result) {
            System.out.print(content + " ");
        }
    }
}
