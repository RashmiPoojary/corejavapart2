package exception;
class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		super(s);
	}
}
	public class Product {
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	public static void main(String[] args) {
		 Product p= new Product();
		 try{
		 p.productCheck(60);
		 }
		 catch(InvalidProductException ex){
		 System.out.println("Caught the exception"); 
		 System.out.println(ex.getMessage());
		 }
	}
}
