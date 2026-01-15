package com.pattern;

public class Q {

    public static void main(String[] args) {

        int rows = 6;  // extra row for the tail
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == 5 || j == 1 || j == 5 || (i == 6 && j == 5)) {  
                    // top, bottom, left, right, tail
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
