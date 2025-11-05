package hw5;

public class Hw5_5 {

	public void genAuthCode() {
		System.out.println("本次產生隨機碼為:");
		
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String s = "";
		for(int i = 0; i <= 8; i++) {
			int r = (int)(Math.random()*a.length());
			char c = a.charAt(r);
			s += c;
		
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Hw5_5 t = new Hw5_5();
		t.genAuthCode();
	}
}
