package f1_10;
public class f2 {
	public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            boolean flag = true; 
            for (int m = 2; m < i; m++) {
                if (i % m == 0) {
                    flag = false;
                    break;
                }
            }
            if(!flag){
                continue;
            }
            System.out.println(i + "是素数");
        }
    }
}