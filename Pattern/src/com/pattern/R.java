package com.pattern;

public class R {


    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (j == 1 ||                       // left vertical line
                    (i == 1 && j < cols) ||         // top horizontal line
                    (i == 3 && j < cols) ||         // middle horizontal line
                    (i == 2 && j == cols) ||        // right vertical line top half
                    (i > 3 && i == j)) {            // diagonal for bottom half

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
