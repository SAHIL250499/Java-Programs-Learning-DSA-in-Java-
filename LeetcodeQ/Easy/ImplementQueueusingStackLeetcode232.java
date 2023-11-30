package LeetcodeQ.Easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementQueueusingStackLeetcode232 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);

    }
}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;


    public QueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();

    }
    public void push(int x) {
        first.push(x);
    }

    public int pop() throws Exception {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked=second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}

//amortized O(1) complexity
class QueueUsingStackOptimized{
    private Stack<Integer> first;
    private Stack<Integer> second;


    public QueueUsingStackOptimized(){
        first=new Stack<>();
        second=new Stack<>();

    }
    public void push(int x) {
        first.push(x);
    }

    public int pop() throws Exception {
        if(!second.isEmpty()){
            return second.pop();
        }
        else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            return second.pop();
        }
    }

    public int peek() throws Exception {
        if(!second.isEmpty()){
            return second.peek();
        }
        else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            return second.peek();
        }
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
