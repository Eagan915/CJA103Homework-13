package hw5;

public class Hw5_3 {

	public int maxElement(int[][] a) {
		int max = a[0][0];
		for(int i = 0; i <a.length; i++) {
			for(int j = 1; j < a[i].length; j++) {
				if(a[i][j] >max)
					max = a[i][j];
			}
		
		}
		return max;
	}
		
	public double maxElement(double[][] b) {
			double max = b[0][0];
			for(int i = 0; i <b.length; i++) {
				for(int j = 1; j < b[i].length; j++) {
					if(b[i][j] >max)
						max = b[i][j];
				}
			
			}
			return max;
	}
	
	public static void main(String[] args) {
		int[][] x = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		double[][] d = {
				{3.5, 6.7, 0.9},
				{4.6, 6.5, 2.5}
		};
		
		Hw5_3 t = new Hw5_3();
		System.out.println(t.maxElement(x));
		System.out.println(t.maxElement(d));
	}
}
