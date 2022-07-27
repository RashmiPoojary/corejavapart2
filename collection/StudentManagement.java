package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> studentArray=new ArrayList<Student>();
		int choice;
		String name, age,city = null;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for Add student Detail");
			System.out.println("Press 2 for Show Student Detail");
			System.out.println("Press 3 for Search student by name");
			System.out.println("Press 4 for Delete User by name"); 
			System.out.println("Press 5 for Sort User by name");
			System.out.println("Press 6 for update age");
			System.out.println("Fress 7 for treeset"); 
			System.out.println("Press 8 to Quit\n \n");
			System.out.println("Make your choice");
			choice = scanner.nextInt();
			
		switch (choice) 
		{
		case 1: 
			System.out.println("Enter the Student Name "); 
			name =scanner.next();
			System.out.println("Enter the Student age"); 
			age= scanner.next(); 
			Student s=new Student ();
			s.setName(name);
			s.setAge (age);
			//s.setCity(city);
			studentArray.add(s);
			System.out.println("Student record has been added");
		break;
		
		case 2:
				System.out.println("---------------------------------------------");
				for (int i=0; i<studentArray.size(); i++) {
					System.out.println("Student Record: "+ (i + 1));
					System.out.println("Student Name:"+ studentArray.get(i).getName());
					System.out.println("Student Age: " + studentArray.get(i).getAge());
					System.out.println("--------------------------------------------");
			}
			break;

			case 3:
				System.out.println("Enter the Student Name for search: ");
				name =scanner.next();
				int ii=0;
				for (int i=0; i<studentArray.size(); i++) 
				{
				if (studentArray.get(i).getName().contains(name)) {
					System.out.println("Student Record: "+(++ii));
					System.out.println("StudentName: " + studentArray.get(i).getName());
					System.out.println("StudentAge: " +studentArray.get(i).getAge());
					System.out.println("-------------------------------------------------");
				}
				}
					if (ii==0) {
						System.out.println("No record Found for that search ");
					}
					break;
					
			case 4:
					System.out.println("Enter the Student Name for Delete: "); 
					name =scanner.next();
					int searchI=0;
					for (int i=0; i<studentArray.size(); i++) {
					if (studentArray.get(i).getName().contains(name)) {
					System.out.println("Student Record: "+(++searchI));
					studentArray.remove(i);
					}
					}
					if (searchI==0) {
						System.out.println("No record Found for delete record");
					}
					else {
						System.out.println("Student Record has been deleted successfully");
					}
					break;
						}
					}
		case 5:
			Collections.sort(studentArray,Studen);
	}
}
