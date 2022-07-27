package exception;
import java.util.Scanner;
class NameNotExistException extends Exception {
	public NameNotExistException(String s) {
		super(s);
	}
}
public class NameNotExistExceptionRunner {

	public static void main(String[] args) {
		String names[]= {"Rashmi","Pranlali","Dhanashree","Kalyani"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		try {
			checkNameExist(name,names);
		}
		catch(NameNotExistException e) {
			System.out.println(e.getMessage());
		}
		}
	private static void checkNameExist(String name, String[] names) throws NameNotExistException {
		boolean flag=false;
		for(String str:names) {
			if(name.equalsIgnoreCase(str)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("name exist");
		}
		else {
			throw new NameNotExistException("name not exist");
		}
	}

}
