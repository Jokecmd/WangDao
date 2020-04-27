package f31_40;

import java.util.Scanner;

public class f34 {

	public static void main(String[] args) {
		int num = compare(1,2,3);
		System.out.println(num);
	}

	public static int compare(int a,int b,int c) {		
		return a>b ? (a>c ? a : c) : (b>c ? b : c);
	}
}
