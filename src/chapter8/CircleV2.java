
package chapter8;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 2.0
 * @date 2018.12.28
 * @copyright СȺ����ô��ô��Ů��
 * @aim ����Բ�ܳ���Բ���
 */
public class CircleV2 {
	/** Բ�뾶 */
	private double radius;
	/** Բ�ܳ� */
	private double perimeter;
	/** Բ��� */
	private double area;
	
	/**
	 * @return the radius ��ȡ�뾶
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * @param radius the radius to set д�뾶
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the parimeter �����ܳ�
	 */
	public double getPerimeter() {
			perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	
	/**
	 * @return the area �������
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
		System.out.println("������Բ�İ뾶��");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		// TODO Auto-generated constructor stub
	}
	
	public void showCircle() {
		System.out.println("Բ���ܳ�Ϊ��" + this.getPerimeter() + 
				"\nԲ�����Ϊ��" + this.getArea());
	}
	
	
}
