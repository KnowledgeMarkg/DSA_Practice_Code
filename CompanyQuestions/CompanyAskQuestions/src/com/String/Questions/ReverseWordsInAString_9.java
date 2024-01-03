package com.String.Questions;

public class ReverseWordsInAString_9 {

	public static void main(String[] args) {
		String string = "hello world!";
		String revString = reverseStringWithChar(string);
		System.out.println("Old String : "+string +" and new String : "+revString);
	}

	private static String reverseStringWithChar(String string) {
		String[] str = string.split(" ");
		StringBuilder sBuilder = new StringBuilder();
		for (String string2 : str) {
	
          for(int i=string2.length()-1; i>=0 ; i--) {
        	  sBuilder.append(string2.charAt(i));
          }
          sBuilder.append(" ");
		}
		return sBuilder.toString();
	}

}
