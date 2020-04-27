package f1_10;

public class f4 {
	public static void main(String[] args) {
		int number = 90;
		int i = 2;
		System.out.print(number+"=");
		while(i < number) {
			if(number % i == 0) { 
				System.out.print(i+"*");
				number = number / i;
			}
			else {
				i++;
			}
		}
		System.out.print(i);
	}
}
