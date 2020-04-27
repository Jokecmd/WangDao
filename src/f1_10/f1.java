package f1_10;
public class f1 {
	public static void main(String[] args) {
		/*
		 * int count=0; int m1=1; int m2=1; for(int i=3;i<=12;i++) { count=m1+m2; m1=m2;
		 * m2=count; System.out.println("第"+i+"个月有"+count+"只兔子");
		 */
		System.out.println(tuzi(8));
		}
		
	
	public static int tuzi(int num) {
		if(num == 1 || num == 2)
			return 1;
		else {
			return tuzi(num - 1) + tuzi(num - 2);
		}
	}
}



