package hw2;

public class Hw2 {
	public static void main(String[] args) {
		int i;
//		for(i = 1 ; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//				
//		}

//		for(i = 1; i <= 9; i++) {
//			int q = 1;
//			do {System.out.print(i + "*"+ q + "=" + i*q + "\t");
//				q++;
//			}while (q <= 9);
//			System.out.println();
//		}

//		i = 1;
//		while (i <= 9) {
//			int k = 1;
//			do {
//				System.out.print(i + "*" + k + "=" + i*k + "\t" );
//				k++;
//			}while (k <= 9);
//			System.out.println();
//			i++;
//		}

//		int a ;
//		int sum = 0;
//		for(a = 0; a <= 1000; a++) {
//			if(a%2 == 0) {
//				sum += a;
//			}
//		}	System.out.println(sum);

//		int x;
//		int s = 1;
//		for(x = 1; x <= 10; x++) {
//			s*=x;
//		}
//		System.out.println(s);

//		int y = 1;
//		int u = 1;
//		while (y <= 10) {
//			u*=y;
//			
//		}
//		y++;
//		System.out.println(u);

//		int d;
//		for (d = 1; d <= 10; d++) {
//			System.out.print(Math.pow(d, 2)+"\t");
//		System.out.print(d*d + "\t");
//		}

//		int c;
//		for(c = 1; c <= 49; c++) {
//			String e = String.valueOf(c);
//			if (e.contains("4")) {
//				continue;
//			}
//			
//			System.out.print(e + "\t");
//		}

		
//		int j ;
//		for (i = 10; i > 0   ; i--) {
//			for(j = 1; j <= i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for (i =1; i <= 6; i++) {
			for(int x = 1 ; x <= i ; x++) {
				char z = (char)('A'+ (i - 1)); // ('A'+ (i - 1)) = 65 + (i - 1)
				System.out.print(z);
			}
			System.out.println();
		}
		
	}

}
