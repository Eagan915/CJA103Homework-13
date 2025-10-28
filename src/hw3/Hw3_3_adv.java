package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3_3_adv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文 請輸入你討厭哪個數字?");
		
		int a = sc.nextInt();
		String s = String.valueOf(a);
		ArrayList<Integer> x = new ArrayList<>();
		int num = 0;
		
		for (int i = 1; i < 50 ; i++) {
				num++;
				if(String.valueOf(num).contains(s)) {
					continue;
				}
				x.add(i);
		}
		System.out.println(x);
		for(int j = 1; j <= 6; j++) {
			int size = x.size();
//			System.out.print(x.size() +"\t");
			int r = (int)(Math.random()*size);
			System.out.print(x.get(r) + "\t");
			x.remove(r);
		}
	}

}
