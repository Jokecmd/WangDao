package f1_10;

import java.util.Scanner;

public class f8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入位数：");
		int num = scanner.nextInt();
		System.out.println("请输入要计算的数字：");
		int a = scanner.nextInt();
		int sum = 0,res = 0;
		for(int i = 1; i <= num; i++) {
			res = a+res*10;
			sum = sum+res;
		}
		System.out.println(sum);
	}
}
