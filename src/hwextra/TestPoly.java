package hwextra;

public class TestPoly {
	
	public static void main(String[] args) {
		Pen[] p = new Pen[2];
		p[0]  = new Pencil("SKR", 15.0);
		p[1] = new InkBrush("A", 30.0);
		
//		System.out.println(p1.getBrand());
//		System.out.println(p1.getPrice());
//		p1.write();
//		System.out.println(i1.getBrand());
//		System.out.println(i1.getPrice());
//		i1.write();
		
		for (int i=0; i < p.length; i++) {
			System.out.println(p[i].getBrand());
			System.out.println(p[i].getPrice());
			p[i].write();
			System.out.println("==========");
		}
	}

}
