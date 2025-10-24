package hw3;

import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int i;
		int [] x = new int[3] ;
		for( i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		
//		System.out.println(t);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		else if(Math.pow(x[0], 2) + Math.pow(x[0], 2)) {} 

		if (x[0] == x[1] && x[1] == x[2]) {
			System.out.println("正三角形");
		} else if (x[0] == x[1] || x[0] == x[2] || x[1] == x[2]) {
			System.out.println("等腰三角形");
		} 
		else if (x[0] == 0 || x[1] == 0 || x[2] == 0) {
			System.out.println("不是三角形");
		} else {
			System.out.println("一般三角形");
		}
		
		

	}

}
