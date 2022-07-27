package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CollectionArrayList {
	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Rashmi");
		li.add(0, "Kalyani");
		li.add("Pranjali");
		li.add(1, "Sarika");
		li.add(2, "Dhanashree");
		System.out.println("List of Element: "+li);
		System.out.println("Length of Element: "+li.size());
		System.out.println("Get the Element: "+li.get(3));
		System.out.println("Set the Element: "+li.set(2, "Kajal"));
		System.out.println("List of Element: "+li);
		System.out.println("Remove the Element: "+li.remove(0));
		System.out.println("List of Element: "+li);
		System.out.println("Contains the Element: "+li.contains("Rashmi"));
		li.add("Rashmi");
		li.add("Sandhya");
		System.out.println("List of Element: "+li);
		String[] arr=li.toArray(new String[0]);
		for(String x:arr)
			System.out.println("List of Element: "+li);
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			}
}
