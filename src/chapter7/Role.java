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
public class Role {
	/** 名称 */
	public String name;
	/** 性别 */
	public String sex;
	/** 年龄 */
	public int age;
	
	//技能释放
	public void doSkill() {
		if(name.equals("红孩儿")) {
			System.out.println(name + "施放技能：哭爹喊娘！");
		}else if(name.equals("孙悟空")) {
			System.out.println(name + "施放技能：吃俺老孙一棒！");
		}else {
			System.out.println(name + "施放技能：必杀！回眸一笑百媚生！");
		}
		
	}
	
	public void showMessage() {
		System.out.println(name + "(" + sex + ")：" + 
	age + "岁，");
	}

}
