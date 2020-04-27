package f31_40;

import java.util.Arrays;

public class f33 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for(int i = 0; i < 10; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]; 
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 2 * (10 - i) - 1; j++) {
				System.out.print(" ");
			}
			for(int m = 0; m <= i; m++) {
				System.out.print(arr[i][m] + "   ");
			}
			System.out.println();
		}
	}

}
