package collection;

import java.awt.Color;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
	enum Color{
		red,blue,pink,yellow,white,black
	}


	public static void main(String[] args) {
		EnumSet<Color>  c=EnumSet.noneOf(Color.class);
		System.out.println("Empty enumset is : " + c);
		EnumSet<Color>  c2=EnumSet.range(Color.blue,Color.black);
		System.out.println("Range enumset is : " + c2);
		c2.add(Color.valueOf("green"));
		Iterator<Color> itr=c2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(" enumset is : " + c2);
	}

}
