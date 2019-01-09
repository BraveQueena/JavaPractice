
package chapter8;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 2.0
 * @date 2018.12.28
 * @copyright 小群子怎么那么淑女呢
 * @aim 计算圆周长、圆面积
 */
public class CircleV2 {
	/** 圆半径 */
	private double radius;
	/** 圆周长 */
	private double perimeter;
	/** 圆面积 */
	private double area;
	
	/**
	 * @return the radius 读取半径
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * @param radius the radius to set 写半径
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the parimeter 计算周长
	 */
	public double getPerimeter() {
			perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	
	/**
	 * @return the area 计算面积
	 */
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	/**
	 * @param radius
	 */
	public CircleV2(double radius) {
//		super();
		this.radius = radius;
	}

	/**
	 * 
	 */
	public CircleV2() {
		System.out.println("请设置圆的半径：");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		// TODO Auto-generated constructor stub
	}
	
	public void showCircle() {
		System.out.println("圆的周长为：" + this.getPerimeter() + 
				"\n圆的面积为：" + this.getArea());
	}
	
	
}
