/**
 * 
 */
package chapter2;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class CalcCircleArea {
	public static void main(String[] args) {
/*		double radius = 2.5;         //Բ�뾶
		double area = 3.14 * radius * radius;
		System.out.println("Բ���Ϊ��" + area);
*/		
		//�ֶ�����Բ�뾶�������
		Scanner input = new Scanner(System.in);
		System.out.print("������Բ�뾶");
		double radius = input.nextDouble(); //��ȡ�û��������һ��double
		double area = 3.14 * radius * radius;
		System.out.println("Բ���Ϊ��"+area);
		
		//��������
		//Scanner input = new Scanner(System.in);
		System.out.print("Ʒ��1��");
		String brand1 = input.next();
		System.out.print("Ʒ��2��");
		String brand2 = input.next();
		
		System.out.println(brand1);
		System.out.println(brand2);
		
		System.out.println("�Ա�");
		char sex = input.next().charAt(0);
		System.out.println("�Ա�"+sex);
		
	}
}
