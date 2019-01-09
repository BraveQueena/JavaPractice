/**
 * 
 */
package chapter2;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim 人民币转换：将给定的钱数转换成较小的单位
 */
public class RMBConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入金额数目：");
		double money = input.nextDouble();
		//处理圆部分
		int yuan = (int)money;
		int numOfShiyuan = yuan / 10;
		int numOfWuyuan = yuan % 10 / 5;
		int numOfYiyuan = yuan % 10 - 5;
		//处理角部分
		int jiao = ((int)(money * 10)) % 10;
		int numOfWujiao = jiao / 5;
		int numOfYijiao = jiao - 5;
		
		System.out.println("十元纸币的数量："+numOfShiyuan);
		System.out.println("五元纸币的数量："+numOfWujiao);
		System.out.println("一元纸币的数量："+numOfYiyuan);
		System.out.println("五角纸币的数量："+numOfWujiao);
		System.out.println("一角纸币的数量："+numOfYijiao);
	}

}
