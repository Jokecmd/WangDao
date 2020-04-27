package f1_10;

public class f9 {
	public static void main(String[] args) {
		int sum;
		for(int i=2;i<=1000;i++) {
			sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) sum+=j;
			}
			if(sum==i) System.out.println(i);
		}
	}
}
