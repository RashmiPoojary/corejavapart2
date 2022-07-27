package com.java.file;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public static void main(String[] args) throws Exception {
		FileInputStream fos=new FileInputStream("D:\\xyz.txt");
		ObjectInputStream obj=new ObjectInputStream(fos);
		Employee e= (Employee)obj.readObject();
		System.out.println("employee details are "+"id: "+e.id +" ,name: "+e.name+" ,city: "+e.city);

	}

}
