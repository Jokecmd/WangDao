package f11_20;

import java.util.Scanner;
 
public class f12
{
    public static void main(String[] args)
    {
		System.out.print("请输入当前的利润: ");
		Scanner sc = new Scanner(System.in);
		long profit = sc.nextLong();
		System.out.println("应发奖金为: "+bonus(profit)+"元!");
    }
	private static long bonus(long profit)
	{
	    long bonusValue = 0;
		System.out.printf("输入的利润为: %d元\n",profit);
		if(100000 >= profit) {
			bonusValue = (long)(profit*0.1);
		}else if((100000 < profit)&&(200000 >= profit)) {
			bonusValue = (long)((profit-100000)*0.075 + 100000*0.1);
		}else if((200000 < profit)&&(400000 >= profit)) {
			bonusValue = (long)((profit-200000)*0.05 + (200000-100000)*0.075 + 100000*0.1);
		}else if((400000 < profit)&&(600000 >= profit)) {
			bonusValue = (long)((profit-400000)*0.03 
				+ (400000-200000)*0.05 + (200000-100000)*0.075 + 100000*0.1);
		}else if((600000 < profit)&&(1000000 >= profit)) {
			bonusValue = (long)((profit-600000)*0.015 
				+ (600000-400000)*0.03 + (400000-200000)*0.05 + (200000-100000)*0.075 + 100000*0.1);
		}else if(1000000 < profit) {
			bonusValue = (long)((profit-1000000)*0.01 
				+ (1000000-600000)*0.015 + (600000-400000)*0.03 
				+ (400000-200000)*0.05 + (200000-100000)*0.075 + 100000*0.1);
		}
		
		return bonusValue;
	}
}