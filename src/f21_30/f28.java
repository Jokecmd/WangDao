package f21_30;

import java.util.Arrays;

public class f28 {

	public static void main(String[] args) {
		int[] arr = {2,1,5,4,7};
		sort(arr);
	}

	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
