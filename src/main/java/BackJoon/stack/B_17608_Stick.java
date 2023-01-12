package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * <a href="https://www.acmicpc.net/problem/17608">막대기</a>
 * 아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를 일렬로 세운 후,
 * 왼쪽부터 차례로 번호를 붙인다. <br>
 * 각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. <br>
 * 일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. <br>
 * 즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. <br>
 * 예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다. <br>
 * N개의 막대기에 대한 높이 정보가 주어질 때,
 * 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다. <br>
 *
 */
public class B_17608_Stick {
    /**
     * 방법 1 - 배열 사용
     * 오른쪽에서 보이기 때문에 배열의 마지막 부터 탐색
     * 현재까지의 최고 막대기 크기와 같거나 작으면 안보임
     * 현재최고 크기의 막대기 보다 큰 블럭이 나오면
     * visibleBlock에 ++ 한 후
     * 가장 큰 블록을 현재 크기로 변경
     *
     */
    static int solution(int[] arr) {
        int visibleBlock = 0;
        int recentTallerBlock = 0;
        for (int i = arr.length - 1 ; i >= 0; i--) {
            if(recentTallerBlock < arr[i]) {
                visibleBlock++;
                recentTallerBlock = arr[i];
            }
        }
        return visibleBlock;
    }

    /**
     * 방법2 - Stack 사용
     * 문제 분류에 Stack이라 써있어서 Stack을 사용해 보았는데,
     * 배열로 푸는 것보다 복잡해서 비효율적인 것 같다.
     * 원리는 방법 1과 동일
     * @param arr
     * @return
     */
    static int solution2(int[] arr) {
        Stack<Integer> recentTallerBlock = new Stack<>();
        int visibleBlock = 0;

        for (int i = arr.length - 1 ; i >= 0; i--) {
            if(recentTallerBlock.isEmpty() || recentTallerBlock.peek() < arr[i]) {
                recentTallerBlock.push(arr[i]);
                visibleBlock++;
            }
        }
        return visibleBlock;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution2(arr));
    }
}
