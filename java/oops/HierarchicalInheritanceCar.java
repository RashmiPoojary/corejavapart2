package java.oops;
class Cars{
	public void Car()
	{
		System.out.println("class car");
	}
}
class Honda extends Cars
{
	public void Honda()
	{
		System.out.println("class Honda");
	}
}
class BMW extends Cars
{
	public void BMW()
	{
		System.out.println("class BMW");
	}
}
class Audi extends Cars
{
	public void Audi()
	{
		System.out.println("class Audi");
	}
}
public class HierarchicalInheritanceCar {

	public static void main(String[] args) {
		Honda h=new Honda();
		BMW b=new BMW();
		Audi a=new Audi();
		h.Car();
		b.BMW();
		a.Audi();
		
		
	}

}
