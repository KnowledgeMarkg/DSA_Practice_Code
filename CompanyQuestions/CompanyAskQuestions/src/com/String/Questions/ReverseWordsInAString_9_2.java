package com.String.Questions;

public class ReverseWordsInAString_9_2 {
	public static void main(String[] args) {
		String input = "   Hello    World!   ";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: "World! Hello"
	}

	private static String reverseWords(String input) {
		String[] strings = input.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for(int i=0; i<strings.length; i++) {
			reversed.append(strings[i]).reverse();
			 if (i > 0) {
	                reversed.append(" ");
	         }
		}
		
		return reversed.toString();
	}
}
