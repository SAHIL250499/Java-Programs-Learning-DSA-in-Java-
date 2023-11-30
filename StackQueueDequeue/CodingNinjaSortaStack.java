package StackQueueDequeue;

import java.util.Stack;


public class CodingNinjaSortaStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(9);
        stack.push(-7);
        stack.push(3);
        sortStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    private static void sortStack(Stack<Integer> stack){
        if(stack.size()==1) return;
        else {
            int temp=stack.pop();
            sortStack(stack);
            insert(stack,temp);
        }
    }

    private static void insert(Stack<Integer> stack,int temp){
        if(stack.isEmpty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }else{
            int val=stack.pop();
            insert(stack, temp);
            stack.push(val);
        }
    }
}
