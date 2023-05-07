package solution;

import java.util.Scanner;

public class recursion_sol {
	public static int sum(int a) {
		if(a >= 0 && a <= 9){
			return a;
		}
		int res = sum(a / 10);
		return res + a % 10;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		System.out.println(sum(a));
	}
}
