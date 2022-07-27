package java.oops;
class data
{
	int a,b;
	void getdata()
	{
		a=10;
		b=20;
	}
}
class sum extends data
{
	int sum;
	void sum()
	{
		sum=a+b;
		System.out.println("\nSum="+sum);
	}
	}
class sub extends sum
{
	int sub;
	void subtract()
	{
		sub=a-b;
		System.out.println("\nSub="+sub);
	}
	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		sub obj=new sub();
		obj.getdata();
		obj.sum();
		obj.subtract();
	}
}
