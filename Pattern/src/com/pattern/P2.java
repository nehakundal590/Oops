package com.pattern;

public class P2 {
	public static void main(String[] args) {
		int n=11;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if (i == 0 && j < n - 1 ||j == n / 2 && i < n - 1 ||   
                    i == n - 1 && j < n / 2 || i == n - 2 && j == 0) {     

			System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=0;j<11;j++) {
			if(i==0&&j>0&& j<(n-1)/2 || j==0&&i>0 || i==(n-1)/2&&j<=(n-1)/2 || j==(n-1 )/2){
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		for(int j=0;j<11;j++) {
			if ((i == 0 &&(j==0||j==6))||
				(i == 0 &&(j==0||j==10))||
				(i == 1 &&(j==0||j==10))||
				(i == 4 &&(j==0||j==10))||
				(i == 6 &&(j==0||j==10))||
				(i == 8 &&(j==0||j==10))||
				(i == 9 &&(j==1||j==9))||
				(i == 10 &&(j==2||j==8))||
				(i==10&&j==5)) {
				
				
			System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
		for(int j=0;j<11;j++) {
			
			if(i==0&&j>0&& j<(n-1)/2 || j==0&&i>0 || i==(n-1)/2&&j<=(n-1)/2 || j==(n-1 )/2){
				System.out.print("*");
			}
			
			
			else {
				System.out.print(" ");
			}
		}
		
		
	//	System.out.println( );
		
	}

}
}
