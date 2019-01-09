
package chapter7;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.24
 * @copyright СȺ����ô��ô��Ů��
 * @aim 16����ת��Ϊ10����
 */
public class HexToDecimalDemo {
	public static void main(String[] args) {
		//1.�û�����һ��10��������
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫת�������֣�����10�������֣���");
		int decNum = input.nextInt();
		//2.���÷���תΪ10��������
		System.out.println(hexToDec(decNum));
		//3.���÷�����16��������תΪ10��������
		System.out.println(decToHex(hexToDec(decNum)));
		
	}
	
	/**
	 * �������16��������ת��Ϊ10����
	 * @param hexNum �����16��������
	 * @return ת���ɹ���10��������
	 */
	public static int decToHex(String hexNum) {
		int decNum = 0;
		//��Ҫ����16���Ƶ��ַ���
		for (int i = 0; i < hexNum.length(); i++) {
			char tempChar = hexNum.charAt(i);
			//���������0-9  a-f
			if(tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hexNum.length() - i - 1);	
			}else if(tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' +10) * Math.pow(16, hexNum.length() - i - 1);
			}
			
		}
		return decNum;
	}
	
	/**
	 * �����������ת��Ϊ16�������
	 * @param decNum �����10��������
	 * @return �����ת���������
	 */
	public static String hexToDec(int decNum) {
		//����˼·��/16 ��ȡ����
		String hex = "";
		while(decNum != 0 ) {
			int temp = decNum % 16;
			if(temp >= 0 && temp <= 9) {
				hex = temp + hex;
			}else if(temp >= 10 && temp <= 15) {
				//������ת��Ϊ�ַ���ƴ��
				hex = (char)(temp + 'A' -10) + hex;
			}
			decNum /= 16;
		}
		
		return hex;
		
	}

}
