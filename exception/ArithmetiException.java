package exception;

public class ArithmetiException {

	public static void main(String[] args) {
		try{
			int a=5;
		int b=0;
		int c=a/b;
		System.out.println("C:"+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code.....");

	}

}
