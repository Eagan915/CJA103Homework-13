package hw4;

public class Hw4_6 {

	public static void main(String[] args) {
		int[][] x = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				    { 37, 75, 77, 89, 64, 75, 70, 95 },
				    { 100, 70, 79, 90, 75, 70, 79, 90 },
				    { 77, 95, 70, 89, 60, 75, 85, 89 },
				    { 98, 70, 89, 90, 75, 90, 89, 90 },
				    { 90, 80, 100, 75, 50, 20, 99, 75 } 
				  };
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0;
		for (int i = 0; i < x.length; i++) {
			int max = x[i][0];
			int col = 0;
			for (int j = 1; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
					col = j;
				}
			}
			System.out.println(max);

			switch (col) {
			case 0:
				n1++;
				break;
			case 1:
				n2++;
				break;
			case 2:
				n3++;
				break;
			case 3:
				n4++;
				break;
			case 4:
				n5++;
				break;
			case 5:
				n6++;
				break;
			case 6:
				n7++;
				break;
			case 7:
				n8++;
				break;
			}
		}
		int[] s = { n1, n2, n3, n4, n5, n6, n7, n8 };
		for (int n = 1; n <= 8; n++) {
			System.out.println(n + "號考" + s[n - 1] + "次最高");
		}
	}

}
