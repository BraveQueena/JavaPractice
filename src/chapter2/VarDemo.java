
package chapter2;
/**
 * �������
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class VarDemo {
	
	public static void main(String[] args) {
		
		System.out.println("ĳ�Ի��ɹ��嵥��");
		System.out.println("��Ʒ����\t����\t����\t�۸�\t��ע");
		String goodName1 = "��ܽ�ɿ���";   //��Ʒ����
		double price1 = 30.9;   //����
		int count1 = 10;   //����
		String remark1 = "�˿̾���˿��";
		
		System.out.printf("%s\t%.2f\t%d\t%s\n\n",goodName1,price1,count1,remark1);
		System.out.println(goodName1+"\t"+price1+"\t"+count1+"\t"+remark1+"\n\n");
		
		String brand = "��˶ASUS" ;//Ʒ��
		String type = "GTX 1080";  //����
		int hz =1569;
		float length = 29.8f;
		float width = 13.4f;
		double height = 5.25;
		
		//��ӡ����
		System.out.println("Ʒ�ƣ�"+brand);
		System.out.println("�ͺţ�"+type);
		System.out.println("����Ƶ�ʣ�"+hz+"MHz");
		System.out.println("����ߣ�"+length+"\t"+width+"\t"+height);
	}
}
