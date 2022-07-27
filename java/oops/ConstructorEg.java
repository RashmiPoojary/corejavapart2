package java.oops;

public class ConstructorEg
{
		int x;
		ConstructorEg(int i)
		{
			x=i;
			//x=20;
			//System.out.println("x:"+x);
		}
	public static void main(String[] args) 
	{
		ConstructorEg t1=new ConstructorEg(10);
		ConstructorEg t2=new ConstructorEg(30);
		System.out.println(t1.x+" "+t2.x);
		
	}

}
