package java.oops;
class employee {
	int salary = 20000;

	public void employee() {
		System.out.println("Salary is:" + salary);
	}
}
class PermanentEmployee extends employee {
	void displayIncrement() {
		System.out.println("Before Increment Salary of permanent employee is:" + salary);
		salary = salary + (salary * 15) / 100;
		System.out.println("After Increment Salary of permanent employee is:" + salary);
	}
}
class TemporaryEmployee extends employee {
	void displayIncrement() {
		System.out.println("Before Increment Salary of temporary employee is:" + salary);
		salary = salary + (salary * 10) / 100;
		System.out.println("After Increment Salary of temporary employee is:" + salary);
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		PermanentEmployee PE = new PermanentEmployee();
		TemporaryEmployee TE = new TemporaryEmployee();
		PE.displayIncrement();
		TE.displayIncrement();
	}
}
