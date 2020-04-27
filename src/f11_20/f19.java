package f11_20;

public class f19 {

	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for(int n = 1; n <= 2 * i - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int n = 1; n <= 7 - 2 * i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
