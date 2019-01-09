/**
 * 
 */
package chapter2;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class IfDemo {
	public static void main(String[] args) {
		if(5>9) {
			System.out.println("大于");
		}
		else
			System.out.println("小于");
	
	//硬盘盘符一般采用A-Z大学字母表示
	//使用程序判断用户输入的字符是否是合法的硬盘盘符
	//1.输入硬盘盘符
	//2.判断是否合法
	//3.打印结果
	Scanner input = new Scanner(System.in);
	System.out.println("请输入硬盘盘符：");
	char ch = input.next().charAt(0);
	if(ch >= 'A' && ch <= 'Z') {
		System.out.println("您输入的是合法的盘符！");
	}
	else {
		System.out.println("您输入的是非法的盘符！");
	}
	}
}