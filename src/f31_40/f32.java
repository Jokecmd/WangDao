package f31_40;

public class f32 {

	public static void main(String[] args) {
		String str = "abcdefghijklmn";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
		System.out.println(reverse.substring(4, 8));
	}

}
