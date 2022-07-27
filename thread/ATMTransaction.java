package thread;

public class ATMTransaction {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			AccountHolder t = new AccountHolder();
			t.setName("Person" + i);
			t.start();
		}
	}
}

class ATMCenter {

	static synchronized void userAction() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " entered");
		System.out.println("Performed Transaction");
		Thread.sleep(400);

		System.out.println(Thread.currentThread().getName() + " transaction complete");

		System.out.println(Thread.currentThread().getName() + "leaving.......");

		System.out.println("---------------------------------------------------------------");
	}
}

class AccountHolder extends Thread {
	public void run() {
		try {
			ATMCenter.userAction();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}