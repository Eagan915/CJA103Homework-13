package hw4;

public class Hw4_3 {

	public static void main(String[] args) {
		String[] x = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length(); j++) {
				char c = x[i].charAt(j);
				if (c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u') {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
