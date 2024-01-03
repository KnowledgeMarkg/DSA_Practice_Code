package com.String.Questions;

public class CompareStringToAnotherString2 {

	public static void main(String[] args) {
		// Using Equals Methods..............
		String str1 = "Hello";
        String str2 = "hello";
        // str2 = str2.substring(0,1).toUpperCase()+str2.substring(1); // Convert 1st Letter Capital
        System.out.println("Equals Methods : "+ str1.equals(str2) );
        
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        
        System.out.println("compareTo : "+ str1.compareTo(str2));
        
        System.out.println("compareToIgnoreCase : "+ str1.compareToIgnoreCase(str2));
        
        
	}

}
