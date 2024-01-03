package com.String.kodnest;

public class PermutationsOfAStringIterativeSolution {

	public static void main(String[] args) {
		String str = "abc";
		findPermutationsOfAString(str);
	}
// If any Doubt in This Concept learn This concept from Pepcoding String Lecture
	private static void findPermutationsOfAString(String str) {
		int n = str.length();
		int f = findFactorials(n);
		for(int i=0 ; i<f; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for(int div =n; div>=1; div--) {
				int q = temp /div;
				int r = temp % div;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				temp = q;
			}
			System.out.println();
		}
	}

	private static int findFactorials(int n) {
		int fact =1;
		for(int i=2; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}

}
