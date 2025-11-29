package hw10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw10_1 {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();

		while (hs.size() != 5) {
			int r = (int) (Math.random() * 100) + 1;
			hs.add(r);

		}

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			isPrime(it.next());
		}
	}

	public static void isPrime(int number) {
		if (number == 1) {
			System.out.println(number + "不是質數");
		}else if (number == 2) {
			System.out.println(number + "是質數");
		} else if (number % 2 == 0) {
			System.out.println(number + "不是質數");
		} else {
			for (int i = 3; i <= Math.sqrt(number); i += 2) {
				if (number % i == 0) {
					System.out.println(number + "不是質數");
					return;
				}	
			}
			System.out.println(number + "是質數");
		}
	}

}
