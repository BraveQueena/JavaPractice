
package chapter7;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.24
 * @copyright 小群子怎么那么淑女呢
 * @aim 16进制转换为10进制
 */
public class HexToDecimalDemo {
	public static void main(String[] args) {
		//1.用户输入一个10进制数字
		Scanner input = new Scanner(System.in);
		System.out.println("请输入想要转换的数字（整型10进制数字）：");
		int decNum = input.nextInt();
		//2.调用方法转为10进制数字
		System.out.println(hexToDec(decNum));
		//3.调用方法将16进制数字转为10进制数字
		System.out.println(decToHex(hexToDec(decNum)));
		
	}
	
	/**
	 * 将输入的16进制数字转换为10进制
	 * @param hexNum 输入的16进制数字
	 * @return 转换成功的10进制数字
	 */
	public static int decToHex(String hexNum) {
		int decNum = 0;
		//需要遍历16进制的字符串
		for (int i = 0; i < hexNum.length(); i++) {
			char tempChar = hexNum.charAt(i);
			//两种情况：0-9  a-f
			if(tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hexNum.length() - i - 1);	
			}else if(tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' +10) * Math.pow(16, hexNum.length() - i - 1);
			}
			
		}
		return decNum;
	}
	
	/**
	 * 将输入的数字转换为16进制输出
	 * @param decNum 输入的10进制数字
	 * @return 输出的转换完的数字
	 */
	public static String hexToDec(int decNum) {
		//基本思路：/16 反取余数
		String hex = "";
		while(decNum != 0 ) {
			int temp = decNum % 16;
			if(temp >= 0 && temp <= 9) {
				hex = temp + hex;
			}else if(temp >= 10 && temp <= 15) {
				//把数字转化为字符再拼接
				hex = (char)(temp + 'A' -10) + hex;
			}
			decNum /= 16;
		}
		
		return hex;
		
	}

}
