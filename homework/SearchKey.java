package homework;

import java.util.Scanner;

public class SearchKey {
	public static void main(String[] args) {
		int n, i, k = 0, se, flag = 0, f = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n < 0) {
			System.out.print("Invalid array size");
			System.exit(0);
		} else {
			int a[] = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (a[i] < 0) {
					System.out.print("Invalid input");
					System.exit(0);
				}
			}
			se = in.nextInt();
			if (se < 0) {
				System.out.print("Key not found");
				System.exit(0);
			}
			int found[] = new int[100];
			for (i = 0; i < n; i++) {
				if (a[i] == se) {
					f = 1;
					found[k] = a[i - 1];
					k++;
				}
			}
			if (f == 0)
				System.out.print("Key not found");
			else {
				for (i = 0; i < k; i++)
					System.out.println(found[i]);
			}
		}
	}

}
