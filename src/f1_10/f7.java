package f1_10;

public class f7 {
	public static void main(String[] args) {
		String s="1234abc d";
		countString(s);
	}
	public static void countString(String s) {
		int world=0,blank=0,number=0,other=0;
		for(int i=0;i<s.length();i++) {
			char exm=s.charAt(i);
			if(('a'<=exm&&exm<='z')||('A'<=exm&&exm<='Z')) {
				world++;
			}
			else if('0'<=exm&&exm<='9') {
				number++;
			}
			else if(exm==' ') {
				blank++;
			}
			else other++;
		}
		System.out.println("字母个数"+world);
		System.out.println("数字个数"+number);
		System.out.println("空格个数"+blank);
		System.out.println("其他字符"+other);
	}
}
