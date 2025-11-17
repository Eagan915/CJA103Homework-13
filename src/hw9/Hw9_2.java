package hw9;

class Money{
	private int balance = 0;
	
	synchronized public void deposit(int dep) {
		while(balance > 3000) {
			System.out.println("媽媽看到餘額超過3000，暫停匯款");
			System.out.println("雄大被老媽告知帳戶已經有錢了");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += dep;
		System.out.println("媽媽存了" + dep + " , 帳戶共有" + balance);
		notify();
	}
	
	synchronized public void withdrawl(int wit) {
		if(balance == 0) {
			System.out.println("雄大看到帳戶沒錢了，暫停提款");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= wit;
		System.out.println("雄大領了" + wit + " , 帳戶共有:" + balance);
		if(balance < 2000) {
			System.out.println("雄大看到餘額在2000以下，要求匯款");
			notify();
		}
		
	}
}

class Mom extends Thread{
	Money dep;
	
	public Mom(Money dep) {
		this.dep = dep;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			dep.deposit(2000);
		}
	}
}

class Son extends Thread{
	Money wit;
	
	public Son(Money wit) {
		this.wit = wit;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			wit.withdrawl(1000);
		}
	}
}


public class Hw9_2 {
	public static void main(String[] args) {
		Money balance = new Money();
		Mom m = new Mom(balance);
		Son s = new Son(balance);
		m.start();
		s.start();
	}
	

}
