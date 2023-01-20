package BackJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/18258">큐 2</a>
 *
 */
public class B_18258_Queue2 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Queue que = new Queue();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
				case "push" : que.push(Integer.parseInt(st.nextToken()));
				case "pop" :
					System.out.println(que.pop());
					break;
				case "size" :
					System.out.println(que.size());
					break;
				case "empty" :
					System.out.println(que.empty());

					break;
				case "front" :
					System.out.println(que.front());
					break;
				case "back" :
					System.out.println(que.back());
					break;
			}
		}
	}

	static class Queue {
		LinkedList<Integer> queue = new LinkedList<>();

		public void push(int num)  {
			queue.offer(num);
		}
		public int pop()  {
			return !queue.isEmpty()? queue.pop() : -1;
		}
		public int size()  {
			return queue.size();
		}
		public int empty() {
			return queue.isEmpty()? 1 : 0;
		}
		public int front() {
			return !queue.isEmpty()? queue.getFirst() : -1;
		}
		public int back() {
			return !queue.isEmpty() ? queue.getLast() : -1;
		}
	}
}

