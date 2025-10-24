package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");

		int r = (int) (Math.random() * 10);
//		System.out.println(r);
		int a;

		do {
			a = sc.nextInt();
			if (a == r) {
				System.out.println("答對了! 答案就是" + r);
			} else {
				System.out.println("猜錯囉");
			}
		} while (a != r);

	}
}
