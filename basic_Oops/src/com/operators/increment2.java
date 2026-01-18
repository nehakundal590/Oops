package com.operators;

public class increment2 {


	public static void main(String[] args) {
		int a = 1, b = 1;
		int c = a++ + b++ + a + b + ++a + ++b;
		System.out.println(c);

	}

}
//output 12
