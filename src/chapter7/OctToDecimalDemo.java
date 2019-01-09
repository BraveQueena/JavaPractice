
package chapter7;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.24
 * @copyright 小群子怎么那么淑女呢
 * @aim Java 编程实现10进制与16进制、8进制之间的转换
 */
public class OctToDecimalDemo {
	public static void main(String[] args) {
		//1.输入想转换的数字
		Scanner input = new Scanner(System.in);
		System.out.println("请输入想转化的10进制整型数字：");
		int decNum = input.nextInt();
		//2.10进制转化为8进制
		System.out.println("相应的8进制数字：" + decToOct(decNum));
		//3.10进制转换为16进制
		System.out.println("相应的16进制数字："+ decToHex(decNum));
		//4.8进制转换为10进制
		System.out.println("相应的10进制数字：" + octToDec(decToOct(decNum)));
		//5.16进制转化为10进制
	}
	
	/**
	 * 16进制转为10进制
	 * @param hexNum 16进制数字
	 * @return 10进制数字
	 */
	public static int hexToDec(String hexNum) {
		int decNum = 0;
		for (int i = 0; i < hexNum.length(); i++) {
			char tempChar = hexNum.charAt(i);
			if(tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hexNum.length() - i - 1);
			}else {
				decNum += (tempChar - 'A' + 10) *  Math.pow(16, hexNum.length() - i - 1);
			}
			
		}
		return decNum;
	}
	
	/**
	 * 8进制转化为10进制数字
	 * @param octNum 8进制数字
	 * @return 10进制数字
	 */
	public static int octToDec(String octNum) {
		int decNum = 0;
		for (int i = 0; i < octNum.length(); i++) {
			char tempChar = octNum.charAt(i);
			decNum += (tempChar - '0') * Math.pow(8, octNum.length() - i - 1);
		}
		return decNum;
	}
	
	/**
	 * 10进制转化为16进制
	 * @param decNum 10进制数字
	 * @return 16进制数字
	 */
	public static String decToHex(int decNum) {
		String hexNum = "";
		while(decNum != 0) {
			int temp = decNum % 16;
			if(temp >= 0 && temp <= 9) {
				hexNum = temp + hexNum;
			}else if(temp >= 10 && temp <= 15){
				hexNum = (char)(temp - 10 + 'A') + hexNum;
			}
			decNum /= 16;
		}
		return hexNum;
	}
	
	/**
	 * 将10进制数字转换为8进制数字
	 * @param decNum 10进制苏子
	 * @return 8进制数字
	 */
	public static String decToOct(int decNum) {
		String octNum = "";
		while(decNum != 0) {
			int temp = decNum % 8;
			octNum = temp +octNum;
			decNum /= 8;
		}
		
		return octNum;
	}

}
