package hw9;

public class Hw9_1 implements Runnable {
	String name;

	public Hw9_1(String name) {
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				int r = (int) (Math.random() * 2500) + 500;
				System.out.println(name + "吃了第" + i + "碗飯");
				Thread.sleep(r);
			}
			System.out.println(name + "吃完了");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("-----大胃王比賽開始-----");
		Hw9_1 a = new Hw9_1("饅頭人");
		Thread t1 = new Thread(a);
		Hw9_1 b = new Hw9_1("詹姆士");
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----大胃王比賽結束-----");

	}

}
