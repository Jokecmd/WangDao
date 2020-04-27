package f21_30;

import java.util.Arrays;
import java.util.Scanner;

public class f29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		int[][] arr = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
	}

}
