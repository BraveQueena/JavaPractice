/**
 * 
 */
package chapter2;

/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class GalenDemo {
	public static void main(String[] args) {
		System.out.println("生命值    ：◆◆◆◆◆◆◇◇");
		System.out.println("物理攻击：◆◆◆◆◆◇◇◇");
		System.out.println("技能伤害：◆◆◆◆◆◆◇◇");
		System.out.println("上手速度：◆◆◆◆◆◇◇◇");
		double attack = 57.88;  //伤害
		double attackGrowth = 4.5;  //伤害成长值
		int attaceDistance = 175;  //攻击距离
		double armor = 27.536;  //护甲
		double armorGrowth = 3.0; //护甲成长值
		double magicResistance = 32.1; //魔抗
		double magicResistanceGrowth = 1.25; //魔抗成长值
		double life = 616.28; //生命值
		double lifeGrowth = 84.25; //生命成长值
		double lifeResponse = 7.84; //生命回复
		double lifeResponseGrowth = 0.5; //生命回复成长值
		double magic = 0.0; //法力值
		double magicGrowth = 0.0; //法力成长值
		int shiftSpeed = 340; //移速
		String vocation = "上单/辅助/打野"; //定位
		int priceRMB = 450; //点券价格
		int price = 1000;  //游戏币价格
		
		System.out.printf("\n伤害：%.2f(+%.2f)",attack,attackGrowth);
		System.out.printf("\t攻击距离：%d",attaceDistance);
		System.out.printf("\n护甲：%.3f(+%.1f)",armor,armorGrowth);
		System.out.printf("\t魔抗：%.1f(+%.2f)",magicResistance,magicResistanceGrowth);
		System.out.printf("\n生命值：%.2f(+%.2f)",life,lifeGrowth);
		System.out.printf("\t生命回复：%.2f(+%.1f)",lifeResponse,lifeResponseGrowth);
		System.out.printf("\n法力值：%.1f(+%.1f)",magic,magicGrowth);
		System.out.printf("\n移速：%d",shiftSpeed);
		System.out.printf("\t\t\t定位：%s",vocation);
		System.out.printf("\n点券：%d",priceRMB);
		System.out.printf("\t\t\t金币：%d",price);
	}
}
