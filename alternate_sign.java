package solution;

import java.util.Scanner;

public class alternate_sign {
	public static int sum(int a) {
		if(a == 1) {
			return a;
		}
		int res = sum(a - 1);
		if(a % 2 == 0) {
			return res - a;
		}
		return res + a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		System.out.println(sum(a));
	}
}
