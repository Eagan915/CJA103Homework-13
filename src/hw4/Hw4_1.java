package hw4;

public class Hw4_1 {
	public static void main(String[] args) {
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 1; i < x.length; i++) {
			sum += x[i];
		}
		int avg = sum / x.length;
		System.out.println("平均: " + avg);

		for (int i = 1; i < x.length; i++) {
			if (x[i] > avg)
				System.out.println(x[i]);
		}
	}

}
