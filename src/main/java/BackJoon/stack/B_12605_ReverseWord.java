package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/12605">단어순서 뒤집기</a>
 * 스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라.
 * 각 라인은 w개의 영단어로 이루어져 있으며,총 L개의 알파벳을 가진다.
 * 각 행은 알파벳과 스페이스로만 이루어져 있다.
 * 단어 사이에는 하나의 스페이스만 들어간다.
 * 첫 행 : 케이스의 개수 (N )
 * N개 행 : 단어. 스페이스로 띄워짐 (1 <= L <= 25)
 */
public class B_12605_ReverseWord {
    private static void solution(int index, String[] input) {
        StringBuilder sb = new StringBuilder();
        sb.append("Case #"+ index + ": ");
        for (int i = 0; i < input.length; i++) {
            sb.append(input[input.length - (1 + i)]);
            if(i == input.length - 1) break;
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            solution(i, input);
        }
        br.close();
    }


}
