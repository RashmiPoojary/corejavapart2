package thread;

import java.util.Scanner;

class Thread1 implements Runnable{
	public void run() {
	int f1=0,f2=1,f3,i,count=10;    
	 System.out.print("Fibonacci Series: "+f1+" "+f2);    
	    
	 for(i=2;i<count;++i)
	 {    
	  f3=f1+f2;    
	  System.out.print(" "+f3);    
	  f1=f2;    
	  f2=f3;    
	 }    
}
	class Thread2 implements Runnable{
		public void run() {
			int i, fact=1, number;
	        System.out.println("Enter the number to which you need to find the factorial:");
	        Scanner sc = new Scanner(System.in);
	        number = sc.nextInt();

	        for(i = 1; i<=number; i++) {
	           fact = fact * i;
	        }
	        System.out.println("Factorial of the given number is:: "+fact);
	}

public class ThreadRunnable {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		Thread2 t2=new Thread2();
		Thread t3=new Thread(t2);
		t3.start();
		

	}

}
	}
}
