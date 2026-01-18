package com.operators;

public class Ternaryoperator {


    public static void main(String[] args) {
        int num = 15;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
}

