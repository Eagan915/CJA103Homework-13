package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle_4 t1 = new MyRectangle_4();
		t1.setWidth(10);
		t1.setDepth(20);
		System.out.println(t1.getArea());
		MyRectangle_4 t2 = new MyRectangle_4(10, 20);
		System.out.println(t2.getArea());
		
	}
}
