package chapter2;
import java.util.Scanner;

/**
 * 记录
 *1.方法要写一步调一步
 *2.明确/(除法取商)
 *      %（除法取余）
 *      \  \t \n等符号符
 *  区别使用
 */

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.26
 * @copyright 小群子怎么那么淑女呢
 * @aim  输入年份和月份，打印日历
 * 已知1900-1-1 是星期一
 */
public class PrintCalendarDemo {
	/** 输入的年份*/
	public static int year = Integer.MIN_VALUE;
	/** 输入的月份*/
	public static int month = Integer.MAX_VALUE;
	/** 一月至十二月，天数*/
	public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		//1.输入年份、月份
		inputYearAndMonth();
		//2.打印标题：年 月，以及 星期几
		printFrame();
		//3.计算之前所有天数
		//3.1计算之前所有年的天数
		int sum = getSumOfYear(year);
		//3.2计算当前月之前 该年的天数
		sum += getSumOfMonth(month);
		//4.计算该月份第一天为周几
		int dayOfWeek = (sum + 1) % 7;
		//System.out.println(dayOfWeek);
		//5.根据计算所得该月份首日为周几打印日历主体
		printCalendarContents(dayOfWeek,year,month);
	}
	
	
	/**
	 * 打印日历主体内容
	 * @param dayOfWeek 第一天为周几
	 * @param year  年
	 * @param month  月
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
	 * 计算当前月之前 该年的天数
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


	//判断是否为闰年
	private static boolean isLeapYear(int year) {
		return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
	}
	
	/**
	 * 计算当前年之前，所有年的天数
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
	 * 打印标题：年月，以及星期
	 */
	private static void printFrame() {
		// TODO Auto-generated method stub
		System.out.println("\t\t" + year + "年\t\t" + month + "月");
		String[] week = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + "\t");
		}
		System.out.println();
		
	}

	/**
	 * 输入年份、月份
	 */
	private static void inputYearAndMonth() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		year = input.nextInt();
		System.out.println("请输入月份：");
		month = input.nextInt();
		if(year == Integer.MIN_VALUE) {
			System.out.println("输入错误，请重新输入！");
		}
	}

}
