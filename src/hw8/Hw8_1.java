package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {

	public static void main(String[] args) {
		List<Object> x = new ArrayList<>();
		short s = 100;
		Object o = new Object();
		BigInteger b = new BigInteger("1000");

		x.add(new Integer(100));
		x.add(3.14);
		x.add(21L);
		x.add(s);
		x.add(5.1);
		x.add("Kitty");
		x.add(new Integer(100));
		x.add(o);
		x.add("Snoopy");
		x.add(b);
	
		for (int i = x.size() - 1; i >= 0; i--) {
			if(x.get(i) instanceof Number) {
				System.out.println(x.get(i));
			}else {
				x.remove(i);
			}
		}
		System.out.println("===============");

		Iterator i = x.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

//		
//		for(Object a : x)
//			System.out.println(a);

	}

}
