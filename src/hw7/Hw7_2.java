package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hw7_2 {

	public void CopyFile(File f1, File f2) {
		try {
			String str;
			
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			int line = 0;
			int ch = 0;
			while((str = br.readLine()) != null) {
				line++;
				ch += str.length();
				System.out.println(str);
				pw.println(str);
			}
			System.out.println("Sample.txt檔案共有" + f1.length() + "個位元" + ch + "個字元" + line + "列資料");
			
			br.close();
			fr.close();
			pw.close();
			bw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args) {
		File f1 = new File("C:\\Users\\TMP-214\\Downloads\\Sample.txt");
		File f2 = new File("C:\\Users\\TMP-214\\eclipse-workspace\\Homework\\Sample2.txt");
		
		Hw7_2 test = new Hw7_2();
		test.CopyFile(f1, f2);
		
	}
}
