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
 * @aim �����ת������������Ǯ��ת���ɽ�С�ĵ�λ
 */
public class RMBConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ŀ��");
		double money = input.nextDouble();
		//����Բ����
		int yuan = (int)money;
		int numOfShiyuan = yuan / 10;
		int numOfWuyuan = yuan % 10 / 5;
		int numOfYiyuan = yuan % 10 - 5;
		//����ǲ���
		int jiao = ((int)(money * 10)) % 10;
		int numOfWujiao = jiao / 5;
		int numOfYijiao = jiao - 5;
		
		System.out.println("ʮԪֽ�ҵ�������"+numOfShiyuan);
		System.out.println("��Ԫֽ�ҵ�������"+numOfWujiao);
		System.out.println("һԪֽ�ҵ�������"+numOfYiyuan);
		System.out.println("���ֽ�ҵ�������"+numOfWujiao);
		System.out.println("һ��ֽ�ҵ�������"+numOfYijiao);
	}

}
