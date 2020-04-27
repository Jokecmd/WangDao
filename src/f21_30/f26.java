package f21_30;

import java.util.Scanner;

public class f26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		switch (time) {
		case "m":
			System.out.println("星期一");
		case "t":
			char c = time.charAt(1);
			if(c == 'u') {
				System.out.println("星期二");
			}else {
				System.out.println("星期四");
			}
		case "w":
			System.out.println("星期三");
		case "f":
			System.out.println("星期五");
			break;

		default:
			break;
		}
	}

}
