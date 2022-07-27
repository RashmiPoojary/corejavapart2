package homework;
import java.util.Scanner;
public class DigitFactorial {
	public static void main(String[] args) {
		int n, i, fact, k = 0, rem;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n < 0) {
			System.out.println("Number too small");
			System.exit(0);
		}
		if (n > 32767) {
			System.out.println("Number too large");
			System.exit(0);

		}
		int factorial[] = new int[100];
		while (n != 0) {
			rem = n % 10;
			fact = 1;
			for (i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			factorial[k] = fact;
			k++;
			n = n / 10;
		}
		for (i = k - 1; i >= 0; i--)
			System.out.println(factorial[i]);
	}
}
