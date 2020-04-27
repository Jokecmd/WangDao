package f31_40;

import java.util.Arrays;

public class f35 {

	public static void main(String[] args) {
		int[] arr = {1,2,-3,4,5,6};
		int min = arr[0];
		int minIndex = 0;
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		//System.out.println(min);
		//System.out.println(minIndex);
		//System.out.println(max);
		//System.out.println(maxIndex);
		arr[maxIndex] = arr[0];
		arr[0] = max;
		arr[minIndex] = arr[arr.length - 1];
		arr[arr.length - 1] = min;		
		System.out.println(Arrays.toString(arr));
	}

}
