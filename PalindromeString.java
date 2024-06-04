package com.sk.test.logical;

public class PalindromeString {

	public static void main(String[] args) {
		checkPalindrome("Madam");
	}

	private static void checkPalindrome(String string) {
		int length = string.length();
		String rev = "";
		for(int i = length-1;i>=0;i--) {
			rev = rev+string.charAt(i);
		}
		if(string.equalsIgnoreCase(rev)) {
			System.out.println(string+" Is Palindrome");
		}
		else
			System.out.println(string+" Is Not Palindrome");
		
	}

}
