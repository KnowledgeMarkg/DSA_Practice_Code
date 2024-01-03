package com.String.Questions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacter_8 {

	public static void main(String[] args) {
		String string = "aaabbssccfdd";
		removeChar(string);
	}

	private static void removeChar(String string) {
		char[] ch = string.toCharArray();
		LinkedHashSet<Character> lSet = new LinkedHashSet<Character>();
		for (char c : ch) {
			lSet.add(c);
		}
		
		for(char charr :lSet) {
			System.out.print(charr);
		}
	}

}
