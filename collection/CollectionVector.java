package collection;

import java.util.Collections;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Rashmi");
		v.addElement("Pranjali");
		v.add("Sarika");
		v.add("Neha");
		v.add("Sarika");
		System.out.println("Vector list: " + v);
		System.out.println("Vector list: " + v.indexOf("Sarika"));
		System.out.println("Vector list: " + v.lastIndexOf("Sarika"));
		System.out.println("Last  Element: " + v.lastElement());
		System.out.println("Get the Element: " + v.get(3));
		System.out.println("Set the Element: " + v.set(2, "Riya"));
		System.out.println("Vector list: " + v);
		System.out.println("Capacity of vector: "+v.capacity());
		Collections.sort(v);
		System.out.println("Vector list: " + v);
 //		System.out.println("Vector list: " + v.indexOf("Sarika"));
//		System.out.println("Vector list: " + v.lastIndexOf("Sarika"));
		
	}

}
