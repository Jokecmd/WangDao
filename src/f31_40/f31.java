package f31_40;

import java.util.Arrays;

public class f31 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr,int left,int right) {
		for(int i = left,j = right; i < j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
