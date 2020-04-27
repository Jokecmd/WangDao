package f11_20;

import java.util.Scanner;

public class f14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入具体天数：");
		int day = sc.nextInt();
		int sum = 0;
		//以平年为准
		int[] months = {0, 31, 59, 90, 120, 151, 181, 212, 243, 173, 304, 334};
		if(month < 0 || month > 12)
			System.out.println("月份格式错误");
		else {
			sum = months[month - 1];
		}
		sum += day;
		if(year % 400 ==0 || (year % 4 ==0 && year % 100 != 0)) {
			if(month > 2)
				sum += 1;
		}
		
		System.out.println(year +"年" + month + "月"+ day + "为第" + sum + "天");
	}

}
