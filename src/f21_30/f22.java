package f21_30;

public class f22 {

	public static void main(String[] args) {
		System.out.println(digui(5));
	}
	
	public static int digui(int num) {
		if(num == 1)
			return 1;
		return digui(num - 1) * num;
	}
}
