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
public class RoleTest {
	public static void main(String[] args) {
		
		Role role1 = new Role();
		Role role2 = new Role();
		Role role3 = new Role();
		
		//��ʼ��
		role1.name = "�캢��";
		role1.sex = "��";
		role1.age = 8;
		role2.name = "�����";
		role2.sex = "��";
		role2.age = 99;
		role3.name = "���ķ�ʦ";
		role3.sex = "��";
		role3.age = 41;
		
		role1.showMessage();
		role1.doSkill();
		
		role2.showMessage();
		role2.doSkill();
		
		role3.showMessage();
		role3.doSkill();
	}

}
