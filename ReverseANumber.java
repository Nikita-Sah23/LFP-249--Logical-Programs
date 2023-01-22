package com.LogicalProgams;

import java.util.*;

public class ReverseANumber {

	public static void main(String[] args) {

     Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the number =");
		int number =scanner.nextInt();
		
		int remainder;
		int reverse = 0;
		
		while (number > 0) {
			remainder = number % 10;
			reverse =  (reverse * 10 + remainder) ;
			number =number / 10;	
		}
		System.out.println("Number after reversed is " + reverse);
		scanner.close();

	}

}
