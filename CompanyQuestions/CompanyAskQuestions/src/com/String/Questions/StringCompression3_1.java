package com.String.Questions;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringCompression3_1 {

	public static void main(String[] args) {
		// For example, the string "aabcccccaaa" would become "a5b1c5".
      
		String string= "aabcccccaaa";
		
		compressString(string);
	}

	private static void compressString(String string) {
		LinkedHashMap<Character, Integer> lMap =new LinkedHashMap<Character, Integer>();
		for (Character character : string.toCharArray()) {
			lMap.put(character, lMap.containsKey(character) ? lMap.get(character)+1 : 1);
		}
		
		for(Entry<Character, Integer> entry : lMap.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}
