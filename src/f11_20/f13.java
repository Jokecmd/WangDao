package f11_20;

public class f13 {

	public static void main(String[] args) {
		for (int i = -100000; i < 1000000; i++) {
            //对第一个数开方
            int a = (int) Math.sqrt(i + 100);
            //对第2个数开方
            int b = (int) Math.sqrt(i + 100 + 168);
            //判断是否满足条件
            if (a * a == (i + 100) && b * b == (i + 100 + 168)) {
                System.out.println(i);
            }
        }   
	}

}
