package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public void PowerXY() throws CalException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值");
		int x;
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		} else {
			throw new InputMismatchException("輸入格式不正確");
		}
		System.out.println("請輸入y的值");
		int y = sc.nextInt();
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}

		System.out.println(x + "的" + y + "次方等於" + (int) Math.pow(x, y));
	}

}
