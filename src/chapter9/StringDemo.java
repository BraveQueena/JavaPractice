/**
 * 记录：char和String类型 
 * char用的是单引号''
 * 而String用的是双引号""
 */
package chapter9;

/**
 * @author 牛冠群
 * @version 1.0
 * @date2019.01.10
 * @copyright 小群子怎么那么淑女呢
 * @aim String类型API的练习
 */
public class StringDemo {
	
	/**
	 * 目标：判断输入的字符是否符合要求
	 * 要求：数字只能包含数字和小数点，且小数点的位置不能是第一个也不能是最后一个,且只能有一个小数
	 * @param str 输入的字符串
	 * @return  判断结果 符合要求则返回true 反之则返回false
	 */
	public static boolean isDecimal(String str) {
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				if(str.charAt(i) == '.') {
					if(i == 0 || i == str.length() - 1) {
						isDecimal = false;
						break;
					}
				}else {
					isDecimal = false;
					break;
				}
			}
		}
		if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))) {
			return false;
		}
		
		if(str.contains(".")) {
			
		}
		
		return isDecimal;
		
	}

}
