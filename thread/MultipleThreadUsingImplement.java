package thread;

import java.util.Scanner;

class Fibbonacci implements Runnable{
	int num;
	public Fibbonacci(int x) {
		// TODO Auto-generated constructor stub
		x=num;
	}
	public void run() {
		
		
		int f0 = 0;
		int f1 = 1, f2 = 0;
		System.out.print(f0 + " " + f1);
		for (int i = 1; i <= num; i++)
			f2 = f0 + f1;
		System.out.print(" " + f2);
		f0 = f1;
		f1 = f2;
		
		
	}

	
}
class Factorial implements Runnable{
	int num1;
	public Factorial(int n) {
		// TODO Auto-generated constructor stub
		n=num1;
	}
	public void run() {
	
	
	int i = 1;
	int fact = 1;
	for (int i1 = 1; i1 <= num1; i1++) {
		fact *= i1;
	}
	System.out.println("factorial of number: " + fact);
//	while (i <= num) {
//		fact *= i;
//		i++;
//	}
	System.out.println("factorial of number: " + fact);
}

}
public class MultipleThreadUsingImplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		System.out.println("Enter a user input :");
		int num1 = sc.nextInt();
		// TODO Auto-generated method stub
		Fibbonacci f1 = new Fibbonacci(num);
		Thread t = new Thread(f1);
		t.start();
		Factorial f2 =new Factorial(num1);
		Thread t1 = new Thread(f2);
		t1.start();
		
	}

}
