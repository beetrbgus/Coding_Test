package BackJoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/10866">덱</a>
 * dequeue는 double-ended queue의 준말.
 * 덱 = 스택 + 큐
 */
public class B_10866_Deque {
    static LinkedList<Integer> deque = new LinkedList<>();

    static void push_front(int X) {
        deque.offerFirst(X);
    }
    static void push_back(int X) {
        deque.offerLast(X);
    }
    static int pop_front() {
        return empty() != 1 ? deque.pollFirst() : - 1;
    }
    static int pop_back() {
        return empty() != 1 ? deque.pollLast() : - 1;
    }
    static int size() {
        return deque.size();
    }
    static int empty() {
        return deque.isEmpty()? 1 : 0;
    }
    static int front () {
        return empty() == 0? deque.getFirst() : -1;
    }
    // 가장 뒤의 정수를 출력.
    static int back() {
        return empty() == 0? deque.getLast() : -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push_front" : push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" : push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    sb.append(pop_front()).append('\n');
                    break;
                case "pop_back" :
                    sb.append(pop_back()).append('\n');
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                    break;
                case "front" :
                    sb.append(front()).append('\n');
                    break;
                case "back" :
                    sb.append(back()).append('\n');
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
