package com.java.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D://abc.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fos);
//		Employee e = new Employee();
//		e.id = 1;
//		e.name = "xyz";
//		e.city = "Pune";
//		obj.writeObject(e);
//		System.out.println("Data is saved");

		Employee2 e1 = new Employee2();
		e1.setId(101);
		e1.setName("Ankita");
		e1.setCity("Hyderabad");

		Employee2 e2 = new Employee2();
		e2.setId(102);
		e2.setName("Ravina");
		e2.setCity("Amravati");

		Employee2 e3 = new Employee2();
		e3.setId(103);
		e3.setName("Shreya");
		e3.setCity("Pune");

		obj.writeObject(e1);
		obj.writeObject(e2);
		obj.writeObject(e3);

		System.out.println("All employee data is saved");

	}
}
