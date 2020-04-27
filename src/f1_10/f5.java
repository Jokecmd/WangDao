package f1_10;

import java.util.Scanner;
public class f5 {
	public static void main(String[] args) {
		String res = "";
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		res = (n >= 90 ? "A" : n >= 60 ? "B" : "C");
		System.out.println("成绩为" + res);
	}
}
