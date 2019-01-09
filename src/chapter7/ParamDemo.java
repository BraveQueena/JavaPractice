
package chapter7;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.24
 * @copyright 小群子怎么那么淑女呢
 * @aim 
 */
public class ParamDemo {
	public static void main(String[] args) {
		paramTest("参数一", 1,2,3,4,5);
	}
	
	
	public static void paramTest(String str,int... num) {
		System.out.println("第一个参数：" + str);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
