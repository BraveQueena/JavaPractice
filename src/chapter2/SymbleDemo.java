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
public class SymbleDemo {
	
	public static void main(String[] args) {
		//一元 ： = ++
		int num1 = 5, num2 = 2;
		int result1 = num1++;
		int result2 = ++num2;
		System.out.println(result1);
		System.out.println(num1);
		//二元： + - * / %
		
		int result = num1 > num2 ? 90:80;
		System.out.println(result);
	}
}
