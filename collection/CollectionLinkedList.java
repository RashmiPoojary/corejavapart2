package collection;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		 LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Rashmi");
	        ll.add("Pranjali");
	        ll.addLast("Sejal");
	        ll.addFirst("Kajal");
	        ll.add(2, "Neha");
	        System.out.println("List of Element: "+ll);
	        System.out.println("Head element of the list is : " + ll.poll());
	        System.out.println("Head of the list : " + ll.peek());
	        System.out.println("Remove the Element: "+ll.remove(3));
	        System.out.println("Remove first Element: "+ll.removeFirst());
	        System.out.println("Remove last Element: " +ll.removeLast());
	        System.out.println(ll);

	}

}
