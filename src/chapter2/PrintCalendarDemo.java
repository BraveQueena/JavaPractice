package chapter2;
import java.util.Scanner;

/**
 * ��¼
 *1.����Ҫдһ����һ��
 *2.��ȷ/(����ȡ��)
 *      %������ȡ�ࣩ
 *      \  \t \n�ȷ��ŷ�
 *  ����ʹ��
 */

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.26
 * @copyright СȺ����ô��ô��Ů��
 * @aim  ������ݺ��·ݣ���ӡ����
 * ��֪1900-1-1 ������һ
 */
public class PrintCalendarDemo {
	/** ��������*/
	public static int year = Integer.MIN_VALUE;
	/** ������·�*/
	public static int month = Integer.MAX_VALUE;
	/** һ����ʮ���£�����*/
	public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		//1.������ݡ��·�
		inputYearAndMonth();
		//2.��ӡ���⣺�� �£��Լ� ���ڼ�
		printFrame();
		//3.����֮ǰ��������
		//3.1����֮ǰ�����������
		int sum = getSumOfYear(year);
		//3.2���㵱ǰ��֮ǰ ���������
		sum += getSumOfMonth(month);
		//4.������·ݵ�һ��Ϊ�ܼ�
		int dayOfWeek = (sum + 1) % 7;
		//System.out.println(dayOfWeek);
		//5.���ݼ������ø��·�����Ϊ�ܼ���ӡ��������
		printCalendarContents(dayOfWeek,year,month);
	}
	
	
	/**
	 * ��ӡ������������
	 * @param dayOfWeek ��һ��Ϊ�ܼ�
	 * @param year  ��
	 * @param month  ��
	 */
	private static void printCalendarContents(int dayOfWeek, int year2, int month2) {
		// TODO Auto-generated method stub
		int lineFeeds = 0;
		if(dayOfWeek == 0) {
			lineFeeds = 6;
		}else {
			lineFeeds = dayOfWeek - 1;
		}
		for (int i = 0; i < lineFeeds; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month - 1]; i++) {
			if((dayOfWeek + i) % 7 == 0) {
				System.out.println(i + 1);
			}else {
				System.out.print((i + 1) + "\t");
			}
		}
	}


	/**
	 * ���㵱ǰ��֮ǰ ���������
	 */
	private static int getSumOfMonth(int month) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += dayOfMonth[i];
		}
		if(isLeapYear(year) && month >= 3) {
			sum++;
		}
		return sum;
	}


	//�ж��Ƿ�Ϊ����
	private static boolean isLeapYear(int year) {
		return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
	}
	
	/**
	 * ���㵱ǰ��֮ǰ�������������
	 */
	private static int getSumOfYear(int year) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1900; i < year; i++) {
			sum += 365;
			if(isLeapYear(i)) {
				sum++;
			}
		}
		return sum;
		
	}

	/**
	 * ��ӡ���⣺���£��Լ�����
	 */
	private static void printFrame() {
		// TODO Auto-generated method stub
		System.out.println("\t\t" + year + "��\t\t" + month + "��");
		String[] week = {"����һ","���ڶ�","������","������","������","������","������"};
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + "\t");
		}
		System.out.println();
		
	}

	/**
	 * ������ݡ��·�
	 */
	private static void inputYearAndMonth() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		year = input.nextInt();
		System.out.println("�������·ݣ�");
		month = input.nextInt();
		if(year == Integer.MIN_VALUE) {
			System.out.println("����������������룡");
		}
	}

}
