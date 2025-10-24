package hw3;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文 請輸入你討厭哪個數字?");
		int a = sc.nextInt();
		
        System.out.println();
		
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			String s = String.valueOf(a);
			String t = String.valueOf(i);
			if (t.contains(s)) {
				continue;
			}
			count++;
			System.out.print(i + "\t");
			if (count % 6 == 0) {
				System.out.println();
			}
		}

		System.out.print("總共有" + count + "個數字可以選");
	}

}
