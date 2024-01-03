package com.String.Questions;

import java.util.Stack;

public class ValidParentheses4 {

	public static void main(String[] args) {
		//Valid Parentheses: Given a string containing just the characters 
		//'(', ')', '{', '}', '[', and ']', 
		//determine if the input string is valid. in java
		
		String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([)]";
        String input5 = "{[]}";
        
        System.out.println(input1 +" is valid : " +isValid(input1));
        System.out.println(input2 +" is valid : " +isValid(input2));
        System.out.println(input3 +" is valid : " +isValid(input3));
        System.out.println(input4 +" is valid : " +isValid(input4));
        System.out.println(input5 +" is valid : " +isValid(input5));
	}

	private static String isValid(String input1) {
		Stack<Character> stack = new Stack<Character>();
		for(Character character : input1.toCharArray()) {
			if(character == '(' || character == '{' || character == '[') {
				stack.push(character);
			}else if (character== ')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			}else if (character == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else if (character == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else {
				return "Galat Hai Aisa Nhi Ho Sakta Mere Rahte";
			}
		}
		
		return stack.isEmpty() ? "Sahi Hai Aisa Ho Sakta Hai" : "Aisa Nhi ho sakta hai";
	}

}
