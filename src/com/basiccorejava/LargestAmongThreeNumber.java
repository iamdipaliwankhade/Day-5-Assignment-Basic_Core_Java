package com.basiccorejava;

import java.util.Scanner;

/**
 * 
 * @author Dipali
 *
 */
public class LargestAmongThreeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		x = sc.nextInt();
		System.out.println("Enter the second no");
		y = sc.nextInt();
		System.out.println("Enter the third no");
		z = sc.nextInt();
		if (x > y && x > z) {
			System.out.println("Largest no :" + x);
		} else if (y > z) {
			System.out.println("Largest no :" + y);
		} else {
			System.out.println("Largest no :" + z);
		}

	}
}
