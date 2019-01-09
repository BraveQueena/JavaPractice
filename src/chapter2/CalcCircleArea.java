/**
 * 
 */
package chapter2;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class CalcCircleArea {
	public static void main(String[] args) {
/*		double radius = 2.5;         //圆半径
		double area = 3.14 * radius * radius;
		System.out.println("圆面积为：" + area);
*/		
		//手动输入圆半径后求面积
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆半径");
		double radius = input.nextDouble(); //读取用户输入的下一个double
		double area = 3.14 * radius * radius;
		System.out.println("圆面积为："+area);
		
		//输入整型
		//Scanner input = new Scanner(System.in);
		System.out.print("品牌1：");
		String brand1 = input.next();
		System.out.print("品牌2：");
		String brand2 = input.next();
		
		System.out.println(brand1);
		System.out.println(brand2);
		
		System.out.println("性别：");
		char sex = input.next().charAt(0);
		System.out.println("性别："+sex);
		
	}
}
