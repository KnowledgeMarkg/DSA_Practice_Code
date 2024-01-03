package com.String.Questions;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitString1 {

	public static void main(String[] args) {
		String st1 = "Apple-Banana-Manggo";
		//1st method To Split String With String Class Split Method
		
		String [] stArr = st1.split("-");
		System.out.println("String Class Split Method");
		for (String string : stArr) {
			System.out.println(string);
		}
		// 2nd method to split string with the help of Pattern Class Compile Method
		List<String> stList = Pattern.compile("-").splitAsStream(st1).collect(Collectors.toList());
		System.out.println("Pattern Class Compile Method");
		for (String string : stList) {
			System.out.println(string);
		}
		
        String input = "apple,banana,orange";
        
        // Split the string using comma as the delimiter
        String[] parts = Pattern.compile(",").split(input);
        System.out.println("Second Way To Split String Using Pattern Class ANd It Return Array");
        for (String part : parts) {
            System.out.println(part);
        }

	}
}
