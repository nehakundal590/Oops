package com.operators;

public class increment3{

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = a++ * b++ + ++a;
		System.out.println(c);

	}

}