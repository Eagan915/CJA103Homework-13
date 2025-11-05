package hw6;

import java.util.InputMismatchException;

public class CalTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
			c.PowerXY();
		} catch (CalException e) {
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
