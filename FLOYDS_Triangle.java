package com.sk.test.logical;

import java.util.Scanner;

public class FLOYDS_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRow , eachRow , elementOfRow ,incrementval = 1;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No of Rows");
		noOfRow = scn.nextInt();
		System.out.println("Floyd's Triangle");
		
		for(eachRow = 1 ;eachRow <= noOfRow ; eachRow++) {
			for(elementOfRow = 1; elementOfRow <= eachRow ; elementOfRow++) {
				System.out.print(incrementval+ " ");
				incrementval++;
			}
			System.out.println("");
		}

	}

}
