/**
 * 
 */
package chapter2;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class GalenDemo {
	public static void main(String[] args) {
		System.out.println("����ֵ    �����������������");
		System.out.println("����������������������");
		System.out.println("�����˺������������������");
		System.out.println("�����ٶȣ���������������");
		double attack = 57.88;  //�˺�
		double attackGrowth = 4.5;  //�˺��ɳ�ֵ
		int attaceDistance = 175;  //��������
		double armor = 27.536;  //����
		double armorGrowth = 3.0; //���׳ɳ�ֵ
		double magicResistance = 32.1; //ħ��
		double magicResistanceGrowth = 1.25; //ħ���ɳ�ֵ
		double life = 616.28; //����ֵ
		double lifeGrowth = 84.25; //�����ɳ�ֵ
		double lifeResponse = 7.84; //�����ظ�
		double lifeResponseGrowth = 0.5; //�����ظ��ɳ�ֵ
		double magic = 0.0; //����ֵ
		double magicGrowth = 0.0; //�����ɳ�ֵ
		int shiftSpeed = 340; //����
		String vocation = "�ϵ�/����/��Ұ"; //��λ
		int priceRMB = 450; //��ȯ�۸�
		int price = 1000;  //��Ϸ�Ҽ۸�
		
		System.out.printf("\n�˺���%.2f(+%.2f)",attack,attackGrowth);
		System.out.printf("\t�������룺%d",attaceDistance);
		System.out.printf("\n���ף�%.3f(+%.1f)",armor,armorGrowth);
		System.out.printf("\tħ����%.1f(+%.2f)",magicResistance,magicResistanceGrowth);
		System.out.printf("\n����ֵ��%.2f(+%.2f)",life,lifeGrowth);
		System.out.printf("\t�����ظ���%.2f(+%.1f)",lifeResponse,lifeResponseGrowth);
		System.out.printf("\n����ֵ��%.1f(+%.1f)",magic,magicGrowth);
		System.out.printf("\n���٣�%d",shiftSpeed);
		System.out.printf("\t\t\t��λ��%s",vocation);
		System.out.printf("\n��ȯ��%d",priceRMB);
		System.out.printf("\t\t\t��ң�%d",price);
	}
}
