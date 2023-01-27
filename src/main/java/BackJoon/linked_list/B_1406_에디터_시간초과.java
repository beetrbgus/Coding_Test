package BackJoon.linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/1406">에디터 </a>
 * 시간 초과
 */
public class B_1406_에디터_시간초과 {
    /**
     *  커서 :
     *  L : 커서 왼쪽으로 한 칸 옮김 (맨 앞일 때는 무시)
     *  D : 커서 오른쪽으로  "
     *  B : 커서 왼쪽 문자 삭제 ( " )
     *  P $ : $라는 문자를 커서 왼쪽에 추가
     *  왼쪽 : -1, 오른쪽 : 0
     */
    static int cursor = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        cursor = sb.length();
        // 길이
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] commandArr = br.readLine().split(" ");
            switch (commandArr[0]) {
                case "L" : curssorLeft();
                    break;
                case "D" : curssorRight();
                    break;
                case "B" : delete();
                    break;
                case "P" : addWord(commandArr[1]);
                    break;
            }
        }
        System.out.println(sb.toString());
    }
    public static void addWord(String addWord) {
        sb.insert(cursor, addWord);
        cursor++;
    }
    public static void curssorLeft() {
        // 커서가 처음일 때는 무시
        if(cursor != 0) {
            cursor --;
        }
    }
    public static void curssorRight() {
        // 커서가 처음이나 마지막일 때는 무시
        if(cursor != sb.length()) {
            cursor++;
        }
    }
    public static void delete() {
        if(!isCursorFirst()) {
            sb.deleteCharAt(cursor -1);
            cursor--;
        }
    }
    public static boolean isCursorFirst() {
        return cursor == 0;
    }
    public static boolean isCursorLast() {
        return cursor == sb.length();
    }
}
