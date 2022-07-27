package exception;

public class NumberFormatException {

	public static void main(String[] args) {
		try{
			String s="rashmi";
	int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

	}


