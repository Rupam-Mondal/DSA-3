package solution;

import java.util.Scanner;

public class armstrongnumber {
	public static double arms(int n , int count) {
		if(n >= 1 && n <= 9) {
			return Math.pow(n, count);
		}
		double res = arms(n / 10 , count);
		return Math.pow(n % 10, count) + res;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		int copy = a;
		int count = 0;
		while(a > 0) {
			count++;
			a = a / 10;
		}
		if(copy == arms(copy , count)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
}
