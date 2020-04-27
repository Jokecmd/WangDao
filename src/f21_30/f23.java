package f21_30;

public class f23 {

	public static void main(String[] args) {
		System.out.println(age(5));
	}

	public static int age(int num) {
		if(num == 1) {
			return 10;
		}
		return age(num - 1) + 2;
	}
}
