package com.String.Questions;

public class ReverseString5 {

	public static void main(String[] args) {
		//reverse a given string without using any library functions or additional data structures.
		
		String string = "Kausar";
		for(int i=string.length()-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
	}

}
