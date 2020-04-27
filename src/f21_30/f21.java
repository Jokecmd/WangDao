package f21_30;

public class f21 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		for(int i = 1; i <= 20; i++) {
			num = num * i;
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
