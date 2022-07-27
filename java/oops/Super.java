package java.oops;

//class Vehicle {
//	int speed = 50;
//
//}
//class Bike extends Vehicle {
//	int speed = 100;
//
//	void display() {
//
//		System.out.println(speed);
//	}
//	public class Super {
//
//		public static void main(String args[]) {
//
//			Bike b = new Bike();
//			b.display();
//		}
//	}
//}
//using super
//class Vehicle {
//	int speed = 50;
//}
//class Bike extends Vehicle {
//	int speed = 100;
//	void display() {
//		System.out.println(super.speed);
//	}
//	public class Super {
//		public static void main(String args[]) {
//			Bike b = new Bike();
//			b.display();
//		}
//	}
//}
class Vehicle {
	void Vehical()
	{
		System.out.println("Vehical is Created");
	}

}
class Bike extends Vehicle {
	Bike() {
		super();
		System.out.println("Bike is Created");
	}
	public class Super {
		public static void main(String args[]) {
			Bike b = new Bike();
		}
	}
}
