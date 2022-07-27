package exception;
class NullStringException extends Exception {
	public  NullStringException(String s) {
		super(s);
	}
}

public class StringNullException {
	public void checkString(String fname,String lname) throws  NullStringException{
		if(fname==null|| lname==null)
			throws new NullStringException("String cannot be null");
		else
			System.out.println(lname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
