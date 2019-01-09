
package chapter7;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.24
 * @copyright СȺ����ô��ô��Ů��
 * @aim Java ���ʵ��10������16���ơ�8����֮���ת��
 */
public class OctToDecimalDemo {
	public static void main(String[] args) {
		//1.������ת��������
		Scanner input = new Scanner(System.in);
		System.out.println("��������ת����10�����������֣�");
		int decNum = input.nextInt();
		//2.10����ת��Ϊ8����
		System.out.println("��Ӧ��8�������֣�" + decToOct(decNum));
		//3.10����ת��Ϊ16����
		System.out.println("��Ӧ��16�������֣�"+ decToHex(decNum));
		//4.8����ת��Ϊ10����
		System.out.println("��Ӧ��10�������֣�" + octToDec(decToOct(decNum)));
		//5.16����ת��Ϊ10����
	}
	
	/**
	 * 16����תΪ10����
	 * @param hexNum 16��������
	 * @return 10��������
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
	 * 8����ת��Ϊ10��������
	 * @param octNum 8��������
	 * @return 10��������
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
	 * 10����ת��Ϊ16����
	 * @param decNum 10��������
	 * @return 16��������
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
	 * ��10��������ת��Ϊ8��������
	 * @param decNum 10��������
	 * @return 8��������
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
