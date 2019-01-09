/**
 * 
 */
package chapter7;


/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class RoleTest {
	public static void main(String[] args) {
		
		Role role1 = new Role();
		Role role2 = new Role();
		Role role3 = new Role();
		
		//初始化
		role1.name = "红孩儿";
		role1.sex = "男";
		role1.age = 8;
		role2.name = "孙悟空";
		role2.sex = "男";
		role2.age = 99;
		role3.name = "无心法师";
		role3.sex = "男";
		role3.age = 41;
		
		role1.showMessage();
		role1.doSkill();
		
		role2.showMessage();
		role2.doSkill();
		
		role3.showMessage();
		role3.doSkill();
	}

}
