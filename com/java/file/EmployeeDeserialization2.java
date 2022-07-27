package com.java.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D://abc.txt");
		ObjectInputStream obj = new ObjectInputStream(fis);
		Employee2 e1 = (Employee2) obj.readObject();
		Employee2 e2 = (Employee2) obj.readObject();
		Employee2 e3 = (Employee2) obj.readObject();
		System.out.println("employee details are: ");
		System.out.println("\nId:" + e1.getId() + "\nName:" + e1.getName() + "\nCity:" + e1.getCity());
		System.out.println("\nId:" + e2.getId() + "\nName:" + e2.getName() + "\nCity:" + e2.getCity());
		System.out.println("\nId:" + e3.getId() + "\nName:" + e3.getName() + "\nCity:" + e3.getCity());

	}

}