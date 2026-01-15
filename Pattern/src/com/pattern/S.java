package com.pattern;

public class S {


    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == 3 || i == 5 ||       // top, middle, bottom horizontal lines
                    (i == 2 && j == 1) ||               // top left vertical
                    (i == 4 && j == cols)) {            // bottom right vertical
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
