
package chapter7;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.24
 * @copyright СȺ����ô��ô��Ů��
 * @aim 
 */
public class ParamDemo {
	public static void main(String[] args) {
		paramTest("����һ", 1,2,3,4,5);
	}
	
	
	public static void paramTest(String str,int... num) {
		System.out.println("��һ��������" + str);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
