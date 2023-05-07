package solution;

public class max_value {
	public static int maximum(int[] arr , int idx) {
		if(idx == arr.length) {
			return 0;
		}
		int res = maximum(arr , idx + 1);
		if(arr[idx] > res) {
			res = arr[idx];
			return res;
		}
		return res;
	}
	public static void main(String args[]) {
		int[] arr = {13 , 1 , -3 , 22 , 5};
		System.out.println(maximum(arr , 0));
	}
}
