package com.basiccorejava;

import java.util.Scanner;
/**
 * 
 * @author Dipal
 *
 */
public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		double number1 = sc.nextDouble();
		System.out.println("Enter second number");
		double number2 = sc.nextDouble();
		System.out.println("Number before Swap : number1 = " + number1 + " number2 = " + number2);
		double temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("Number after Swap : number1 = " + number1 + " number2 = " + number2);
	}

}
