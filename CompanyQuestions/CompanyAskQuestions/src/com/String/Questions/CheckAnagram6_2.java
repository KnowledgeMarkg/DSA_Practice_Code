package com.String.Questions;

import java.util.Arrays;

public class CheckAnagram6_2 {

	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";
        str2.toLowerCase();

        boolean result = areAnagrams(str1, str2);
        if(result) {
        	System.out.println(str1 + " and " + str2 + " are anagrams.");
        }else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	private static boolean areAnagrams(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
