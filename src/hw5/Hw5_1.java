package hw5;

import java.util.Scanner;

public class Hw5_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		
		int[]x = new int [2];
		for(int i = 0; i < x.length; i++ ) {
			x[i] = sc.nextInt();
		}
		
		for(int i= 1; i <= x[1]; i++) {
			for (int j = 1; j <= x[0]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
