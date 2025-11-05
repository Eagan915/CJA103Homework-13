package hw5;

public class MyRectangle_4 {
	
	private double width;
	private double depth;
	
	public MyRectangle_4() {}
	
	public MyRectangle_4(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	 void setWidth(double width) {
		this.width = width;
	}
	
	 void setDepth(double depth) {
		this.depth = depth;
	}
	 
	 double getArea() {
		 return width*depth;
	 }
	

}
