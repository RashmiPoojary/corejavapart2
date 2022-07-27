package collection;

import java.util.Arrays;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Integer[] i = { 3, 5, 9, 17, 23, 41 };
		Integer[] j = { 2, 5, 13, 17, 41, 51 };
		Set<Integer> set1 = new java.util.HashSet<Integer>();
		set1.addAll(Arrays.asList(i));
		Set<Integer> set2 = new java.util.HashSet<Integer>();
		set2.addAll(Arrays.asList(j));
		Set<Integer> union_Set = new java.util.HashSet<Integer>(set1);
		System.out.print("Union is: ");
		System.out.println(union_Set);
		Set<Integer> intersection_Set = new java.util.HashSet<Integer>(set1);
		intersection_Set.retainAll(set2);
		System.out.print("Intersection is: ");
		System.out.println(intersection_Set);
		Set<Integer> difference_Set = new java.util.HashSet<Integer>(set1);
		difference_Set.removeAll(set2);
		System.out.print("Difference of set1 from set2 is: ");
		System.out.println(difference_Set);
	}
}
