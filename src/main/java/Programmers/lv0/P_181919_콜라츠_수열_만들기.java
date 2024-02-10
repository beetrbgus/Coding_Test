package Programmers.lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P_181919_콜라츠_수열_만들기 {
    public static int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();

        do {
            answerList.add(n);
            if(n == 1) {
                break;
            }else if(n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3 + 1);
            }
        } while(true);
        int[] answer = answerList.stream().mapToInt(integer -> integer).toArray();
        return answer;
    }
    public int[] streamSolution(int n) {
        return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : 3 * i + 1).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int n = 10;
        int[] resultArr = solution(n);

        for (int result : resultArr) {
            System.out.println(result + ", ");
        }
    }
}
