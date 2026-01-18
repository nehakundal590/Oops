package com.operators;

public class increment5 {



	public static void main(String[] args) {

		int a = 10;

		// Pre-Increment
		int preIncrement = ++a; // Increment a first, then assigns
		System.out.println("Pre-Increment (++a): " + preIncrement); // Output: 11
		System.out.println("Value of a after Pre-Increment: " + a); // Output: 11

		// Post-Increment
		int postIncrement = a++; // Assign a, then increments
		System.out.println("Post-Increment (a++): " + postIncrement); // Output: 11
		System.out.println("Value of a after Post-Increment: " + a); // Output: 12

		// Pre-Decrement
		int preDecrement = --a; // Decrement a first, then assigns
		System.out.println("Pre-Decrement (--a): " + preDecrement); // Output: 11
		System.out.println("Value of a after Pre-Decrement: " + a); // Output: 11

		// Post-Decrement
		int postDecrement = a--; // Assign a, then Decrement
		System.out.println("Post-Decrement (a--): " + postDecrement); // Output: 11
		System.out.println("Value of a after Post-Decrement: " + a); // Output: 10
	}

}
