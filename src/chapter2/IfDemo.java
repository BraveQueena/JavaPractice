/**
 * 
 */
package chapter2;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class IfDemo {
	public static void main(String[] args) {
		if(5>9) {
			System.out.println("����");
		}
		else
			System.out.println("С��");
	
	//Ӳ���̷�һ�����A-Z��ѧ��ĸ��ʾ
	//ʹ�ó����ж��û�������ַ��Ƿ��ǺϷ���Ӳ���̷�
	//1.����Ӳ���̷�
	//2.�ж��Ƿ�Ϸ�
	//3.��ӡ���
	Scanner input = new Scanner(System.in);
	System.out.println("������Ӳ���̷���");
	char ch = input.next().charAt(0);
	if(ch >= 'A' && ch <= 'Z') {
		System.out.println("��������ǺϷ����̷���");
	}
	else {
		System.out.println("��������ǷǷ����̷���");
	}
	}
}