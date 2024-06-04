package com.sk.test.logical;

import java.util.Scanner;

public class InsertElementInArray {
	/*
	 * Insert Element into an array at specific position
	 * {10,20,30,40,50}
	 * In position 2 input value = 100
	 */
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the Elements");
		
		//Input Elements through Console Scanner till array size
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		//Read the inputed elements
		System.out.println("Print the Elements Before insert");
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Enter the Position where to Insert");
		int position = scn.nextInt();
		
		System.out.println("Enter the value to insert");
		int value = scn.nextInt();
		
		//Shifting Element Logic Right replaced with left value
		for(int i = arr.length-1;i>position;i--) {
			arr[i]= arr[i-1];
		}
		
		arr[position]= value;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
