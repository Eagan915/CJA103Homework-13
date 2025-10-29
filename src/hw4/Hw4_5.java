package hw4;

import java.util.Scanner;

public class Hw4_5 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入年月日");
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if(m == 2 && d > 29) {
				System.out.println("2月最多到29天喔");
				return;
			}else if(m == 4 || m == 6 || m == 9 || m == 11 && d >31) {
				System.out.println(m + "月只有30天喔");
				return;
			}
			
			if(y % 100 == 0 && y % 400 != 0) {
				x[1] = 28;
			} else if(y % 4 == 0) {
				x[1] = 29;
			}else {
				x[1] = 28;
			}
			
			int days = 0;
			for(int i = 0; i < (m - 1); i++) {
				days += x[i];
			}
			System.out.println("輸入的日期為該年第" + (days+d) + "天");
		}

}
