package hw4;

import java.util.Scanner;

public class Hw4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入預借金額");
		int b = sc.nextInt();

		int[][] x = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 }

		};
		System.out.print("有錢可借的員工編號: ");
		int count = 0;
		for(int i = 1; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++){
				if (x[i][j] >= b) {
					System.out.print(x[0][j] + " ");
					count++;
				}
			}
		}
		System.out.print( "共" + count + "人!");
	}

}
