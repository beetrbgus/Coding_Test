package BackJoon.linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * <a href="https://www.acmicpc.net/problem/1406">에디터 </a>
 * 시간 초과
 */
public class B_1406_에디터 {
    /**
     *  커서 :
     *  L : 커서 왼쪽으로 한 칸 옮김 (맨 앞일 때는 무시)
     *  D : 커서 오른쪽으로  "
     *  B : 커서 왼쪽 문자 삭제 ( " )
     *  P $ : $라는 문자를 커서 왼쪽에 추가
     *  왼쪽 : -1, 오른쪽 : 0
     */
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> linkedList = new LinkedList<>();

        for (char inputChar : br.readLine().toCharArray()) {
            linkedList.add(inputChar);
        }
        ListIterator<Character> iter = linkedList.listIterator();
        while(iter.hasNext()) {
            iter.next();
        }
        // 길이
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String readLine = br.readLine();
            char command = readLine.charAt(0);
            switch (command) {
                case 'L' :
                    if(iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D' :
                    if(iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B' :
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P' :
                    iter.add(readLine.charAt(2));
                    break;
                default: break;
            }
        }
        for (char word : linkedList) {
            sb.append(word);
        }

        System.out.println(sb.toString());
    }
}
