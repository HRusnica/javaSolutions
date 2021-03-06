package com.techelevator;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
 Write a command line program which displays a Fibonacci sequence to the console. The program accepts an integer value as a command line 
 argument which specifies when to terminate the Fibonacci sequence, and quit the program.
  
 $ java Fiboncci 25
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {

		int limit = Integer.parseInt(args[0]);
		int previous = 0;
		System.out.print("0");
		for(int next = 1; next < limit; ) { // the first and last section of the for loop are optional.  Here, we do not do anything at the end of each iteration.
			System.out.print(", "+next);
			int temp = previous + next;
			previous = next;
			next = temp;
		}
	}
}
