package hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw7_3 {
	
	public static void main(String[] args) {
		File myDir = new File("C:\\data");
		myDir.mkdir();
		File myFile = new File("C:\\data\\Object.ser");
		Animal[] a = new Animal[4];
		a[0] = new Cat("Kitty");
		a[1] = new Cat("Lily");
		a[2] = new Dog("Doggy");
		a[3] = new Dog("Puppy");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for(int i = 0; i < a.length; i++) {
			oos.writeObject(a[i]);
			
			oos.close();
			fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
