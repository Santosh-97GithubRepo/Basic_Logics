package com.sk.test.logical;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate_String {

	public static void main(String[] args) {

		String str = "aaaabcderr";
		System.out.println(removeDuplicate(str));
	}

	private static String removeDuplicate(String str) {

		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		int len = str.length();
		for(int i = 0;i<len ;i++) {
			Character ch = str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sf.append(ch);
			}
		}
		return sf.toString();
	}

}
