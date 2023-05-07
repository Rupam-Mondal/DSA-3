package solution;

public class sum_arry {
	public static int sum(int[] arr , int idx) {
		if(idx == arr.length) {
			return 0;
		}
		int res = sum(arr , idx + 1);
		return arr[idx] + res;
	}
	public static void main(String args[]) {
		int[] arr = {13 , 1 , -3 , 22 , 5};
		System.out.println(sum(arr , 0));
	}
}
