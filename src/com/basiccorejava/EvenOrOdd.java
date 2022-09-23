package com.basiccorejava;

import java.util.Scanner;

/**
 * 
 * @author Dipali
 *
 */
public class EvenOrOdd {

	public static void main(String[] args) {
		/**
		 * Taking a number from user Checking whether the number is Even or Odd
		 */
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if (x % 2 == 0) {
			System.out.println("The entered number is Even");
		} else {
			System.out.println("The entered number is Odd");
		}

	}

}
