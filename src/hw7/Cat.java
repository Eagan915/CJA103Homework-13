package hw7;

public class Cat extends Animal {
	private String name;
	 private static final long serialVersionUID = 1L;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
