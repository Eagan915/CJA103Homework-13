package hw10;

import java.util.Scanner;

public class hw10_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例如:20110131)");
		String date = "";
		String regex = "^\\d{4}[0-1]{1}\\d{1}[0-3]{1}\\d{1}$";
		boolean correct = false;
	
		while(!correct) {
			date = sc.next();
			if(date.matches(regex)) {
				correct = true;
			}else {
				System.out.println("格式不正確，請再輸入一次");
			}
		}
		
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String da = date.substring(6, 8);
		
		System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年");
		int se = sc.nextInt();
		
		switch(se) {
		case 1:
			System.out.println(year + "/" + month + "/" + da );
		break;	
		case 2:
			System.out.println(month + "/" + da + "/" + year );
		break;
		case 3:
			System.out.println(da + "/" + month + "/" + year );
		break;
		default:
			System.out.println(date);
		
		}
		
		
		
		
		
	}

}
