package f11_20;

public class f11 {
	public static void main(String[] args) {
        int i = 0,j=0,k=0,count=0;
        for(i = 1; i <= 4; i++) {
            for(j = 1; j <= 4; j++) {
                for(k = 1; k <= 4; k++) {
                    if(i != j&& j != k && i!= k) {
                        count += 1;
                        System.out.println(i*100 + j*10 + k);
                    }
                }
            }
        }
        System.out.println("一共"+count+"个数字");
	}

}
