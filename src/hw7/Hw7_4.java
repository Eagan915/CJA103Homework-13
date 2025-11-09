package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_4 {
	
	public static void main(String[] args) {
		
		File ff = new File("C:\\data\\Object.ser");
		try {
			FileInputStream fis = new FileInputStream(ff);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Animal[] a = new Animal[4];
			a[0] = (Animal)ois.readObject();
			a[1] = (Animal)ois.readObject();
			a[2] = (Animal)ois.readObject();
			a[3] = (Animal)ois.readObject();
			
			for(int i = 0; i < a.length; i++) {
				a[i].speak();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
