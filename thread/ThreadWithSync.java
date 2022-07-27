package thread;

class First
{
	synchronized public void display(String msg)
	{
	System.out.print ("["+msg);
	System.out.println("]");

	}  }

	class Second extends Thread{
	 String msg;
	First obj; 
	Second (First fp, String str)
	{ 
	obj = fp;
	msg = str;
	start();
	} 
	public void run() {
	obj.display(msg);
	}
	}
	public class ThreadWithSync {
	public static void main(String[] args) {
	First fnew = new First();
	Second ss = new Second (fnew, "welcome");
	Second ss1= new Second (fnew, "to");
	Second ss2 = new Second (fnew, "multi-threading");
	} }

