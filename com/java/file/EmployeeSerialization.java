package com.java.file;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class EmployeeSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("D:\\xyz.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		Employee e=new Employee();
		e.id =101;
		e.name="rashmi";
		e.city="mumbai";
		obj.writeObject(e);
		System.out.println("Data is saved");
	}
}
