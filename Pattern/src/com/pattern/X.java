package com.pattern;

public class X {
	public static void main(String[] args) {
		int n=19;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==j || i+j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}/*package com.pattern;

public class X {
    public static void main(String[] args) {
        int n = 19;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Print * on both diagonals
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    // Print space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

