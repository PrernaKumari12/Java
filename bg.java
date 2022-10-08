package basic;

import java.util.Scanner;

public class bg {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int sum = 0;
		int i = 1;
		int count = 0;
		for (int row = 1; row <= n1; row++) {
			while (count < n1) {

				sum = 3 * i + 2;
				if (sum % n2 != 0) {
					System.out.println(sum );
					count++;
				}
			i++;
			}

		}

	}

}
