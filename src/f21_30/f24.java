package f21_30;

import java.util.Scanner;

public class f24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("请输入：");
		int num = sc.nextInt();
		
		/*
		 * String s = num + ""; if(s.length() > 5) { System.out.println("超出范围"); }else {
		 * System.out.println(s.length() + "位数"); }
		 */
		int temp = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = num % 10;
			System.out.println(a[i] + " ");
			num = num / 10;
			if(num == 0) {
				temp = i + 1;
				break;
			}
		}
		System.out.println(temp + "位数");
		
	}

}
