/**
 * 
 */
package chapter8;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.28
 * @copyright 小群子怎么那么淑女呢
 * @aim 输入圆半径，计算圆的周长和面积
 */
public class Circle {
	/** 半径 */
	public static double radius;
	/** 周长 */
	public static double perimeter;
	/** 面积 */
	public static double area;
	
	//构造
	public Circle() {
		inputRadius();
	}
	public Circle(double radius1) {
		if(radius1 > 0) {
			radius = radius1;
		}else {
			inputRadius();
		}
	}
	
	//输入半径
	public void inputRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		radius = input.nextDouble();
		input.close();
	}
	
	//计算周长
	public void showPerimeter() {
		if(radius <= 0) {
			inputRadius();
		}else {
			perimeter = 2 * Math.PI * radius;
		}
		System.out.printf("圆的周长为：%.2f\n",perimeter);
	}
	
	//计算面积
	public void showArea() {
		if(radius <= 0) {
			inputRadius();
		}else {
			area = Math.PI * Math.pow(radius, 2);
			System.out.printf("圆的面积为：%.2f\n",area);
		}
	}

}
