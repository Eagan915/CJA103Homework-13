package hw7;

public class Dog extends Animal {
	private String name;
	 private static final long serialVersionUID = 1L;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
