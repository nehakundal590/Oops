package com.pattern;



public class P6 {


	public static void main(String[] args) {
	

		int n = 19;
		// n = size of pattern (19 rows aur 19 columns)

		for (int i = 0; i <= n - 1; i++) {
		// outer loop --> rows ke liye (0 se 18 = total 19 rows)

			for (int j = 0; j <= n - 1; j++) {
			// inner loop --> columns ke liye (0 se 18)

				if (
					i == 0 && j <= (n - 1) / 2 ||
					// top left horizontal line (half)

					j == 0 && i <= (n - 1) / 2 ||
					// left vertical line (upper half)

					i + j <= (n - 1) / 2 ||
					// upper left diagonal (triangle shape)

					i == 0 && j >= (n - 1) / 2 ||
					// top right horizontal line

					j == (n - 1) && i <= (n - 1) / 2 ||
					// right vertical line (upper half)

					j - i >= (n - 1) / 2 ||
					// upper right diagonal

					i >= (n - 1) / 2 && j == 0 ||
					// left vertical line (lower half)

					i == n - 1 && j <= (n - 1) / 2 ||
					// bottom left horizontal line

					i - j >= (n - 2) / 2 ||
					// lower left diagonal

					i == (n - 1) && j >= (n - 1) / 2 ||
					// bottom right horizontal line

					j == (n - 1) && i >= (n - 1) / 2 ||
					// right vertical line (lower half)

					i + j >= (n - 1) + (n - 1) / 2
					// lower right diagonal
				) {
					System.out.print("*");
					// agar koi bhi condition true ho --> star print karo
				} 
				else {
					System.out.print(" ");
					// warna space print karo
				}
			}

			for (int j = 0; j <= n - 1; j++) {
			// second shape ke liye second column loop

				if (
					i + j >= (n - 1) / 2 &&
					i + j <= (n - 1) + (n - 1) / 2 &&
					i - j <= (n - 1) / 2 &&
					j - i <= (n - 1) / 2
				) {
					System.out.print("*");
					// yeh conditions milkar ek diamond / box type shape banati hain
				} 
				else {
					System.out.print(" ");
					// condition false --> space
				}
			}

			System.out.println();
			// ek row complete hone ke baad next line me jao
		}
	}
}
