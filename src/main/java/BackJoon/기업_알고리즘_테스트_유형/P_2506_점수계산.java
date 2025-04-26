package BackJoon.기업_알고리즘_테스트_유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/2506">점수 계산</a>
 */
public class P_2506_점수계산 {
    public static int solution(int numberCount, String[] numberArr) {
        int answer = 0;
        if(numberCount != numberArr.length) {
            throw new RuntimeException("입력 숫자 갯수가 일치하지 않습니다.");
        }
        int additionalPoint = 0;
        for (int i = 0; i <= numberArr.length - 1; i++) {

            int number = Integer.parseInt(numberArr[i]);
            boolean isCorrect = number == 1;

            // 정답이면 점수 추가
            if(isCorrect) {
                // 기본 정답 점수
                answer += number;
                // 추가 점수 추가
                answer += additionalPoint;
                // 정답이고 다음것도 정답이면 가산점 추가
                if(i < numberCount - 1) {
                    int next = Integer.parseInt(numberArr[i + 1]);

                    if(next == 1) {
                        // 다음게 정답이면 가산점 1점 추가
                        additionalPoint ++;
                    } else {
                        // 다음게 정답 아니면 가산점 초기화
                        additionalPoint = 0;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(bufferedReader.readLine());
        String[] numberArr = bufferedReader.readLine().split(" ");

        int result = solution(numberCount, numberArr);
        System.out.println(result);
    }
}
