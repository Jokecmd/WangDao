package f11_20;

public class f20 {

	public static void main(String[] args) {
		double sum = 0;
		double a = 1;
		double b = 2;
		double temp = 0;
		for(int i = 0; i < 20; i++) {
			sum = sum + (b / a);
			temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(sum);
	}

}
