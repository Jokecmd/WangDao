package f1_10;

public class f10 {
	public static void main(String[] args) {
		float high=100,sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+high+high/2;
			//System.out.println("第"+i+"次通过的路程"+sum);
			high=high/2;	
		}
		System.out.println(sum);
		System.out.println(high);
	}
}
