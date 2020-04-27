package f1_10;

import java.util.Scanner;

public class f6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       System.out.print("请输入两个整数：");
	       int num1 = in.nextInt();
	       int num2 = in.nextInt();
	       int max = 0,min = 0;
	       int i = num1 * num2;
	       if(num1 < num2)//num2较小
	    	   {
	    	   int temp = num1;
	    	   num1 = num2;
	    	   num2 = temp;
	    	   }
	       int res = -1;
	       while(num2 != 0)
	       {   res = num1%num2;
	    	   num1 = num2;
	    	   num2 = res;
	       }
	       max = num1;
	       min = i / num1;
	       System.out.println("最大公约数为:"+max+",最小公倍数为："+min);
	       }
}
