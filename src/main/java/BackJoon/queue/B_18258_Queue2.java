package BackJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/18258">큐 2</a>
 *
 */
public class B_18258_Queue2 {
	static int[] queue;
	static int frontIndex = 0;
	static int backIndex = 0;
	static int queueSize = 0;
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		queue = new int[N];
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
				case "push" : push(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					sb.append(pop()).append('\n');
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
			}
		}
		System.out.println(sb);
	}

	public static void push(int num)  {
		queue[backIndex] = num;
		backIndex++;
		queueSize++;
	}
	public static int pop()  {
		int isEmpty = empty();
		if(isEmpty == 0) {
			int num = queue[frontIndex];
			frontIndex++;
			queueSize--;
			return num;
		} else {
			return -1;
		}
	}
	public static int size()  {
		return queueSize;
	}
	public static int empty() {
		return queueSize > 0 ? 0 : 1;
	}
	public static int front() {
		return empty() == 0 ? queue[frontIndex]: -1;
	}
	public static int back() {
		return empty() == 0 ? queue[backIndex - 1]: -1;
	}
}

