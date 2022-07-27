package java.oops;

class Car 
{
	String s;
 Car()
 	{
		s="Ford";
		System.out.println(s);
	}
	void getbrand() 
	{
		System.out.println("Brand="+s);
	}
}
public class MyCar
{
	public static void main(String[] args) 
	{
	Car c=new Car();
	c.getbrand();
	}
}
