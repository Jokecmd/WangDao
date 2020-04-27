package f11_20;

public class f17 {

	public static void main(String[] args) {
		int a = 1;
		for(int d=9;d>0;d--){
			System.out.println("第"+d+"天"+"吃完还剩"+a+"个桃子");
			a = (1+a)*2;
			
		}
		System.out.println("第一天总共摘了"+a+"个桃子");
	}

}
