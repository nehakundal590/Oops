package com.pattern;

public class P7 {



	public static void main(String[] args) {
	// main method --> program execution yahin se start hota hai

		int n = 11;
		// n = pattern ka size (11 rows × 11 columns)

		for (int i = 0; i < n; i++) {
		// outer loop --> rows (0 se 10 tak)

			for (int j = 0; j < n; j++) {
			// first inner loop --> first pattern ke columns

				if (
					i == 0 && j < n - 1 ||
					// top horizontal line (last column chhod kar)
                   j == n / 2 && i < n - 1 ||
					// center vertical line (neeche tak)
                    i == n - 1 && j < n / 2 ||
					// bottom horizontal line (left half)
                    i == n - 2 && j == 0
					// bottom se ek upar, first column me star
				) {
					System.out.print("*");
					// condition true --> star print
				} else {
					System.out.print(" ");
					// condition false --> space
				}
			}

			for (int j = 0; j < 11; j++) {
			// second pattern ke columns

				if (
					i == 0 && j > 0 && j < (n - 1) / 2 ||
					// top horizontal (middle tak)

					j == 0 && i > 0 ||
					// left vertical line

					i == (n - 1) / 2 && j <= (n - 1) / 2 ||
					// center horizontal line

					j == (n - 1) / 2
					// right vertical line
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 0; j < 11; j++) {
			// third pattern --> manually designed star positions

				if (
					(i == 0 && (j == 0 || j == 10)) ||
					// first row me fixed stars
                    (i == 0 && (j == 0 || j == 10)) ||
					// first row ke corners
                    (i == 1 && (j == 0 || j == 10)) ||
					// second row ke corners
                    (i==4 && (j==0||j==10))||
                    (i==6&&(j==0||j==10))||
					(i == 8 && (j == 0 || j == 10)) ||
					// middle rows ke corners
                    (i == 9 && (j == 1 || j == 9)) ||
					// slant shape banane ke liye

					(i == 10 && (j == 2 || j == 8)) ||
					// aur neeche slant
					(i == 10 && j == 6)
					// last row ka center star
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			// patterns ke beech 2 spaces ka gap

			for (int j = 0; j < 11; j++) {
			// fourth pattern --> same as second pattern (repeat)

				if (
					i == 0 && j > 0 && j < (n - 1) / 2 ||
					j == 0 && i > 0 ||
					i == (n - 1) / 2 && j <= (n - 1) / 2 ||
					j == (n - 1) / 2
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			 System.out.println();
			// yahan line break commented hai,
			// isliye output same line me continue hota hai
		}
	}
}
