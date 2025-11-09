package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw7_1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\TMP-214\\eclipse-workspace\\Homework\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos, true);

			Set<Integer> s = new HashSet<Integer>();
			while (s.size() != 10) {
				int r1 = (int) (Math.random() * 1000) + 1;
				s.add(r1);
			}

			Iterator<Integer> it = s.iterator();
			while (it.hasNext()) {
				ps.println(it.next());
			}

			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
