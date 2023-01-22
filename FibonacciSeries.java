package com.LogicalProgams;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to print Fibonacci series");

		int number = scanner.nextInt();

		int number1 = 0;
		int number2 = 1;

		System.out.println(number1);
		System.out.println(number2);

		while (number > 2) {
			int sum = number1 + number2;

			System.out.println(sum);

			number1 = number2;
			number2 = sum;
			number--;

		}
		scanner.close();
	}

}
