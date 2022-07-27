package homework;

import java.util.Scanner;

public class ArithmeticOperation {
	int ag1, a2, ag3;

	public int performArithmeticOperation(int a, int b, int c) {

		if (a < 0 || b < 0 || a > 32767 || b > 32767)

			return -1;

		else

		{

			switch (c)

			{

			case 1:{

				return (a + b);
			}
			case 2:{

				return (a - b);
			}
			case 3:{

				return (a * b);
			}

			case 4:{

				return (a / b);
			}
			default:
			{
				return -1;
			}
		}
	}

}

	public static void main(String[] args) {

		ArithmeticOperation ao = new ArithmeticOperation();

		System.out.println("Enter input a and b");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter choice:\n1.Addition \n2.Difference \n3.Product \n4.Division");
		int ch = sc.nextInt();
		int res = ao.performArithmeticOperation(a, b, ch);
		if (res != -1)
			System.out.println("output:" + res);
		else
			System.out.println("invalid output");

	}

}
