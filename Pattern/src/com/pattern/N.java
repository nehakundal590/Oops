package com.pattern;

public class N {


    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {

                if (j == 1 || j == rows || i == j) { // left, right vertical + diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
