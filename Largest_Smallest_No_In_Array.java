package com.sk.test.logical;

public class Largest_Smallest_No_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[] {1,100,20,30,55,123};
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MIN_VALUE;
		
		for(int num : intArr) {
			if(num > largest) {
				largest = num;
			}
		}
		System.out.println("Largest no is "+largest);
		
		for(int num : intArr) {
			if(num < smallest) {
				smallest = num;
			}
		}
		System.out.println("Smallest No is "+smallest);

	}

}
