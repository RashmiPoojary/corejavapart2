package thread;

public class SeatReservation {

	public static void main(String[] args) {
		Reservation reserve=new Reservation();
		Person thread1=new Person(reserve,5);
		thread1.start();
		Person thread2=new Person(reserve,4);
		thread2.start();
		Person thread3=new Person(reserve,1);
		thread3.start();
	}

}
class Reservation
{
	static int availableSeats=10;
	synchronized void reserveSeat(int requestedSeates)
	{
		System.out.println(Thread.currentThread().getName()+"entered.");
		System.out.println("Availableseats: "+availableSeats+" Requestedseats: "+requestedSeates);
		if(availableSeats>=requestedSeates)
		{
			System.out.println("Seat Available.Reserve now:-)");
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeates+" seats reserved.");
			availableSeats=availableSeats-requestedSeates;
		}
		else
		{
			System.out.println("Requested seats not available :-(");
		}
		System.out.println(Thread.currentThread().getName()+" leaving.");
		System.out.println("----------------------------------------------------"); 
	}
}
class Person extends Thread
{
	Reservation reserve;
	int requestesSeats;
	public Person(Reservation reserve,int requestedSeats)
	{
		this.reserve=reserve;
		this.requestesSeats=requestedSeats;
	}
	public void run()
	{
		reserve.reserveSeat(requestesSeats);
	}
}