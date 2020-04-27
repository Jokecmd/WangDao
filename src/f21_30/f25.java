package f21_30;

public class f25 {

	public static void main(String[] args) {
		isHuiwen(12321);
	}
	
	public static boolean isHuiwen(int num) {
		int a = num;
		if(num < 0 || (num % 10 == 0 && num != 0)) {
			System.out.println("no");
			return false;
		}
		int b = 0;
		while(a > 0) {
			b = b*10 + a %10;
			a /= 10;
		}
		if(num == b) {
			System.out.println("yes");
			return true;
		}else {
			System.out.println("no");
			return false;
		}
	}
}
