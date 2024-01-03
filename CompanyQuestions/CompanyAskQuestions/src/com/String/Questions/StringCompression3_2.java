package com.String.Questions;

public class StringCompression3_2 {

	public static void main(String[] args) {
		// For example, the string "aabcccccaaa" would become "a2b1c5a3".
		String string = "aabcccccaaa";
		String compString= StringcompressString(string);
		System.out.println(compString);
	}

	private static String StringcompressString(String str) {
		if (str == null || str.isEmpty()) {
            return str;
        }
		StringBuffer sBuffer = new StringBuffer();
		char currentChar = str.charAt(0);
		int count =1;
		System.out.println(str.length());
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)==currentChar) {
				count++;
			}else {
				sBuffer.append(currentChar).append(count);
				currentChar = str.charAt(i);
				count =1;
			}
		}
		sBuffer.append(currentChar).append(count);
		return sBuffer.toString();
	}
}
