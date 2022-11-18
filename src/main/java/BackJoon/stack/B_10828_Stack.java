package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제링크 : <a href="https://www.acmicpc.net/problem/10845"> 스택 </a>
 *
 */
public class B_10828_Stack {
    private static int[] stackArr;
    private int newIndex = 0;
    private int nowIndex = newIndex -1;
    private int result = 0;
    public void nextIndex() {
        newIndex++;
        nowIndex++;
    }
    public void prevIndex() {
        newIndex--;
        nowIndex--;
    }

    public void push(int number){
        stackArr[newIndex] = number;
        nextIndex();
    }
    public int top(){
        return (empty() != 1) ? stackArr[nowIndex] : -1;
    }
    public int size(){
        return newIndex;
    }
    public int pop(){
        int top = top();
        if(top != -1) {
            stackArr[nowIndex] = 0;
            prevIndex();
        }
        return top;
    }
    public int empty(){
        return (nowIndex < 0) ? 1 : 0;
    }

    private void commandParser(String command) throws IOException {
        if(command.contains("push")) {
            String commandNumber = command.split(" ")[1];
            push(Integer.parseInt(commandNumber));
        }else {
            int result = 0;
            switch (command) {
                case "top" : result = top();
                    break;
                case "size" : result = size();
                    break;
                case "pop" : result = pop();
                    break;
                case "empty" : result = empty();
                    break;
            }
            System.out.println(result);
        }
    }
    public static void main(String[] args) throws IOException {
        B_10828_Stack stack = new B_10828_Stack();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        stackArr = new int[input];
        for (int i = 0; i < input; i++) {
            String command = reader.readLine();
            stack.commandParser(command);
        }
    }
}
