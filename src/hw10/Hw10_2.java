package hw10;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Hw10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		boolean correct = false;
		double number = 0;

		while (!correct) {
			if (sc.hasNextDouble()) {
				number = sc.nextDouble();
//				System.out.println(number);
				correct = true;
			} else {
				System.out.println("輸入格式不正確，請再輸入一次");
				sc.next();
			}

		}
		
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			thousand(number);
		break;
		case 2:
			percentage(number);
		break;
		case 3:
			science(number);
		break;
		default:
			System.out.println(number);
		}

	}
	
	
	public static void thousand(double number) {
		NumberFormat nf = NumberFormat.getInstance();
		String re = nf.format(number);
		System.out.println(re);
	}
	
	public static void percentage(double number) {
		System.out.println((int)(number*100) + "%");
	}
	
	public static void science(double number) {
		DecimalFormat df = new DecimalFormat("#.##E0");
		System.out.println(df.format(number));
		
	}
	
	
}
