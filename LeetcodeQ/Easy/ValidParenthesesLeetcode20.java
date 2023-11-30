package LeetcodeQ.Easy;

import java.util.Arrays;
import java.util.Stack;

public class ValidParenthesesLeetcode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    private static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')' && stack.peek()=='(' ||s.charAt(i)=='}' && stack.peek()=='{' ||s.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
