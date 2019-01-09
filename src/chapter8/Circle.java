/**
 * 
 */
package chapter8;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.28
 * @copyright СȺ����ô��ô��Ů��
 * @aim ����Բ�뾶������Բ���ܳ������
 */
public class Circle {
	/** �뾶 */
	public static double radius;
	/** �ܳ� */
	public static double perimeter;
	/** ��� */
	public static double area;
	
	//����
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
	
	//����뾶
	public void inputRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		radius = input.nextDouble();
		input.close();
	}
	
	//�����ܳ�
	public void showPerimeter() {
		if(radius <= 0) {
			inputRadius();
		}else {
			perimeter = 2 * Math.PI * radius;
		}
		System.out.printf("Բ���ܳ�Ϊ��%.2f\n",perimeter);
	}
	
	//�������
	public void showArea() {
		if(radius <= 0) {
			inputRadius();
		}else {
			area = Math.PI * Math.pow(radius, 2);
			System.out.printf("Բ�����Ϊ��%.2f\n",area);
		}
	}

}
