package com.sk.test.logical;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		char[] chars =str.toCharArray();
		int count = 0;
		for(char ch : chars) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
				count++;
				break;
			}
		}
		System.out.println("No of Vowels in String = "+count);
	}

}
