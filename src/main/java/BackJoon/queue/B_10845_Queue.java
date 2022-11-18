package BackJoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 링크 : <a href="https://www.acmicpc.net/problem/10845"> 큐 </a>
 */
public class B_10845_Queue {
	private static int[] queue;
	private int frontIndex = 0;
	private int backIndex = 0;
	public void push(int number) {
		queue[backIndex] = number;
		backIndex++;
	}
	public int pop() {
		int frontNumber = front();
		if(frontNumber != -1) {
			frontIndex++;
		}
		return frontNumber;
	}
	public int front() {
		return (empty() != 1 ) ? queue[frontIndex] : -1;
	}
	public int back() {
		return (empty() != 1 ) ? queue[backIndex - 1] : -1;
	}
	public int size() {
		return backIndex - frontIndex;
	}
	public int empty() {
		return backIndex == frontIndex ? 1 : 0;
	}
	public void commandParser(String command) {
		if(command.contains("push")) {
			int number = Integer.parseInt(command.split(" ")[1]);
			push(number);
		}else {
			int result = 0;
			switch (command) {
				case "pop" : result = pop();
					break;
				case "size" : result = size();
					break;
				case "empty" : result = empty();
					break;
				case "front" : result = front();
					break;
				case "back" : result = back();
					break;
			}
			System.out.println(result);
		}
	}
	public static void main(String args[]) throws IOException {
		B_10845_Queue b_10845_queue = new B_10845_Queue();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(reader.readLine());
		queue = new int[input];
		for (int i = 0; i < input; i++) {
			String command = reader.readLine();
			b_10845_queue.commandParser(command);
		}
	}
}