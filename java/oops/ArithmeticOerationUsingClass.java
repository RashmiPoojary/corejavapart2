package java.oops;

class student {
	int RollNo = 1;
	String name = "Rashmi";

	void display() {
		System.out.println("Rolll no:" + RollNo);
		System.out.println("Name is:" + name);
	}

	void add(int a, int b) {
		System.out.println("addition:" + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("substraction:" + (a - b));
	}

	void mul(int a, int b) {
		System.out.println("multiplication:" + (a * b));
	}

	void div(int a, int b) {
		System.out.println("division:" + (a / b));
	}

	void mod(int a, int b) {
		System.out.println("module:" + (a % b));
	}
}

public class ArithmeticOerationUsingClass {

	public static void main(String[] args) {
		student s=new student();
		s.display();
		s.add(4,5);
		s.sub(10,5);
		s.mul(2,4);
		s.div(10, 2);
		s.mod(10, 5);

	}

}
