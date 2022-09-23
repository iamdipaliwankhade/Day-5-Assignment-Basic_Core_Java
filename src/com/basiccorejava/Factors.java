package com.basiccorejava;
/**
 * 
 * @author Dipali
 *
 */

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whose prime factor required");
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println(number);
		} else {
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0 && isPrime(i))
					System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return false;
	}
}
