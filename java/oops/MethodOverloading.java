package java.oops;
class Calculation
{
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	void sum(float a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(double a,float b,int c) 
	{
		System.out.println(a+b+c);
	}
}
public class MethodOverloading
{
	public static void main(String[] args) 
	{
		Calculation obj=new Calculation();
		obj.sum(10,10,10);
		obj.sum(20,20);
		obj.sum(1.2f,20.1f,10);
		obj.sum(2.2f,20);
		
	}
}
