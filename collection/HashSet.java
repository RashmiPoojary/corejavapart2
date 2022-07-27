package collection;

public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet<String> hset=new java.util.HashSet<String>();
		hset.add("Rashmi");
		hset.add("Pranjali");
		hset.add("Sarika");
		hset.add("Neha");
		hset.add(null);
		System.out.println("Element in HashSet is : " + hset);
		System.out.println(hset.isEmpty());
		System.out.println("Remove the Element: " + hset.remove("Neha"));
		System.out.println("Size of Element: " + hset.size());
		System.out.println("HashCode: " + hset.hashCode());
		System.out.println(hset.contains("Rashmi"));
		java.util.HashSet<String> hs=new java.util.HashSet<String>();
		hs.add("Riya");
		hs.add("Preethi");
		hs.add("Sneha");
		hs.add("Niya");
		hs.addAll(hset);
		System.out.println("Element in HashSet is : " + hs);
	}

}
