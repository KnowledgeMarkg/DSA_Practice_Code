package com.String.Questions;

public class CheckAnagram6_1 {

	public static void main(String[] args) {
		String string1 = "java";
		String string2 = "avaj";
		
	    boolean b=checkAnagaramString(string1, string2);
	    System.out.println(string1 +" and " +string2 +" is Anagram = " +b);
	}

	private static boolean checkAnagaramString(String string1, String string2) {
		StringBuilder sBuilder = new StringBuilder(string2);
		char[] ch = string1.toCharArray();
		for (char c : ch) {
			int index = sBuilder.indexOf(String.valueOf(c));
			if (index !=-1) {
				sBuilder.deleteCharAt(index);
			}else {
				return false;
			}
		}
		return sBuilder.isEmpty();
	}

}
