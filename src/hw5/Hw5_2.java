package hw5;

public class Hw5_2 {
	
	
	public void randAvg() {
		int[] x = new int[10];
		System.out.println("本次亂數結果:");
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random() * 101);
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum/10);
	}
	
	public static void main(String[] args) {
		Hw5_2 t = new Hw5_2();
		t.randAvg();
	}

}
