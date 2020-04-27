package f11_20;

import java.util.Scanner;

public class f15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x > y) {
			int temp1 = x;
			x = y;
			y = temp1;
		}
		if(x > z) {
			int temp2 = x;
			x = z;
			z = temp2;
		}
		if(y > z) {
			int temp3 = y;
			y = z;
			z = temp3;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
