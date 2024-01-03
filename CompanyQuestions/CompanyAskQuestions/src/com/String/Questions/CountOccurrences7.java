package com.String.Questions;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountOccurrences7 {

	public static void main(String[] args) {
		String string = "Kausar Raza Ansari";
		string = string.toLowerCase().replaceAll(" ", "");
		findOccurrenceOfChar(string);
	}

	private static void findOccurrenceOfChar(String string) {
		LinkedHashMap<Character, Integer> lMap= new LinkedHashMap<Character, Integer>();
		char[] ch = string.toCharArray();
		for (char c : ch) {
			lMap.put(c, lMap.containsKey(c) ? lMap.get(c)+1 : 1);
		}
		for(Entry<Character, Integer> entry : lMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
