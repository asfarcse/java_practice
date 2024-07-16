package leetcode;

import java.util.Stack;

class Problem20 {
	
	public static void main(String[] args) {
		Problem20 object = new Problem20();
		Boolean result = object.isValid("{}");
		System.out.println("result is :::"+result);
	}
	
    public boolean isValid(String s) {
    	Stack<Character> leftSymbols = new Stack<>();
        char[] charArray = s.toCharArray();
        for(char ch:charArray) {
        	if(ch == '(' || ch == '{' || ch == '[') {
        		leftSymbols.push(ch);
        	} else if(ch == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
        		leftSymbols.pop();
        	} else if(ch == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
        		leftSymbols.pop();
        	} else if(ch == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
        		leftSymbols.pop();
        	} else {
        		return false;
        	}
        }
        return leftSymbols.isEmpty();
    }
}
