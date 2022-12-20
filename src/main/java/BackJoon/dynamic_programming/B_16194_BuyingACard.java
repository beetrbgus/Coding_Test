package BackJoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/16194">카드 구매하기 2</a><br>
 * 요즘 민규네 동네에서는 스타트링크에서 만든 PS카드를 모으는 것이 유행이다.<br>
 *
 * PS카드는 PS(Problem Solving)분야에서 유명한 사람들의 아이디와 얼굴이 적혀있는 카드이다.<br>
 * 각각의 카드에는 등급을 나타내는 색이 칠해져 있고, 다음과 같이 8가지가 있다.<br>
 * 전설, 레드, 오렌지, 퍼플,
 * 블루, 청록, 그린, 그레이
 *
 * 오늘은 돈을 최소로 지불해서 카드 N개를 구매하려고 한다. 카드가 i개 포함된 카드팩의 가격은 Pi원이다. <br>
 * 예를 들어, 카드팩이 총 4가지 종류가 있고,
 * P1 = 1, P2 = 5, P3 = 6, P4 = 7인 경우에
 * 민규가 카드 4개를 갖기 위해 지불해야 하는 금액의 최솟값은 4원이다. <br>
 * -> 1개 들어있는 카드팩을 4번 사면 된다. <br>
 *
 * P1 = 5, P2 = 2, P3 = 8, P4 = 10인 경우에는 카드가 2개 들어있는 카드팩을 2번 사면 4원이고, 이 경우가 민규가 지불해야 하는 금액의 최솟값이다. <br>
 * 카드 팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최솟값을 구하는 프로그램을 작성하시오. <br>
 * N개보다 많은 개수의 카드를 산 다음, 나머지 카드를 버려서 N개를 만드는 것은 불가능하다. <br>
 * 즉, 구매한 카드팩에 포함되어 있는 카드 개수의 합은 N과 같아야 한다. <br>
 */
public class B_16194_BuyingACard {
    /**
     * DP(동적 프로그래밍)을 사용하여 품.
     * <a href="https://hongjw1938.tistory.com/47">DP 개념</a>
     *
     * 1. 문제 내의 변수 개수 찾기.
     * 여기서는 N개의 카드의 최소값이기 때문에 N이 변수가 됨.
     *
     * 2. 변수간 관계식 만들기
     * 3번째 카드라고 가정한다면-> 3개의 카드가 있는 카드팩 사기 or 2개의 카드팩의 최소값 + 1개 카드팩의 최소값으로 사기
     * N번째 카드 : N개 카드팩 사기 vs N-1개 카드팩의 최소값 + 1개 카드팩의 가격
     *
     * 3. 데이터 메모하기
     * int 배열인 minPrice를 만들어서 그 값을 저장. 배열 크기는 0번째 0을 넣을 인덱스를 포함해야하기 때문에 N + 1
     *
     * 4. 가장 작은 값
     * 0개의 카드값은 아무 의미 없기 때문에 값이 0을 가지게
     *
     * 5. 구현
     * Bottom-Up 방식 사용 ( 아래에서부터 계산하고 누적시켜서 큰 문제를 해결
     *
     * @param wantCardNum
     * @param cardPackPriceArr
     * @return
     */
    public static int solution(int wantCardNum, String[] cardPackPriceArr) {
        int[] cardPrice = new int[wantCardNum + 1];
        int[] minPrice = new int[wantCardNum + 1];

        for (int i = 1; i <= wantCardNum; i++) {
            // 1 5 6 7
            cardPrice[i] = Integer.parseInt(cardPackPriceArr[i-1]);
            minPrice[i] = cardPrice[i];

            for (int j = 1; j <= i; j++) {
                minPrice[i] = Math.min(minPrice[i], minPrice[i - j] + cardPrice[j]);
            }
        }
        return minPrice[wantCardNum];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] cardPackPriceArr = bufferedReader.readLine().split(" ");

        int result = solution(N, cardPackPriceArr);
        System.out.println(result);
    }
}
