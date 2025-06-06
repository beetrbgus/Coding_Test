package BackJoon.기업_알고리즘_테스트_유형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href="https://www.acmicpc.net/problem/16205">변수명</a>
 * 첫째 줄에 카멜 표기법을 사용한 경우,
 * 둘째 줄에 스네이크 표기법을 사용한 경우,
 * 셋째 줄에 파스칼 표기법을 사용한 경우를 출력한다.
 */
public class P_16205_변수명 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int type = Integer.parseInt(input[0]);
        String name = input[1];

        List<String> words = new ArrayList<>();

        if (type == 1 || type == 3) {
            StringBuilder sb = new StringBuilder();
            for (char c : name.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    words.add(sb.toString());
                    sb = new StringBuilder();
                }
                sb.append(Character.toLowerCase(c));
            }
            words.add(sb.toString());
            if (type == 3 && words.get(0).isEmpty()) words.remove(0);
        } else { // 스네이크
            words = Arrays.asList(name.split("_"));
        }

        // 카멜 케이스
        String camelCase = words.get(0) + words.stream()
                .skip(1)
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining());

        // 스네이크 케이스
        String snakeCase = String.join("_", words);

        // 파스칼 케이스
        String pascalCase = words.stream()
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining());

        System.out.println(camelCase);
        System.out.println(snakeCase);
        System.out.println(pascalCase);
    }
}
