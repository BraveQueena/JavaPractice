/**
 * ��¼��char��String���� 
 * char�õ��ǵ�����''
 * ��String�õ���˫����""
 */
package chapter9;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date2019.01.10
 * @copyright СȺ����ô��ô��Ů��
 * @aim String����API����ϰ
 */
public class StringDemo {
	
	/**
	 * Ŀ�꣺�ж�������ַ��Ƿ����Ҫ��
	 * Ҫ������ֻ�ܰ������ֺ�С���㣬��С�����λ�ò����ǵ�һ��Ҳ���������һ��,��ֻ����һ��С��
	 * @param str ������ַ���
	 * @return  �жϽ�� ����Ҫ���򷵻�true ��֮�򷵻�false
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
