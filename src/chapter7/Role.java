/**
 * 
 */
package chapter7;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class Role {
	/** ���� */
	public String name;
	/** �Ա� */
	public String sex;
	/** ���� */
	public int age;
	
	//�����ͷ�
	public void doSkill() {
		if(name.equals("�캢��")) {
			System.out.println(name + "ʩ�ż��ܣ��޵����");
		}else if(name.equals("�����")) {
			System.out.println(name + "ʩ�ż��ܣ��԰�����һ����");
		}else {
			System.out.println(name + "ʩ�ż��ܣ���ɱ������һЦ��������");
		}
		
	}
	
	public void showMessage() {
		System.out.println(name + "(" + sex + ")��" + 
	age + "�꣬");
	}

}
