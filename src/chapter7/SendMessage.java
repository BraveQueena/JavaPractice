/**
 * 
 */
package chapter7;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.12.26
 * @copyright СȺ����ô��ô��Ů��
 * @aim ʹ������ʵ����Ϸ��������
 */
public class SendMessage {
	public static void main(String[] args) {
		SendMessage("������","����Ƶ��1");
	}
	
	/**
	 * ��ʽʵ�ֺ���
	 * @param nikName ��Ϸ�ǳ�
	 * @param channelName ����Ƶ��
	 */
	public static void SendMessage(String nikName,String channelName) {
		String[] contents = {
				"�������",
				"��������ģ��������ҵģ������Ǻ����˵ģ�",
				"��ӭ����������ҫ��",
				"һ���˹µ��Ķ��ڲݴ����ʧ������?",
				"�������Ҳ�����"
		};
		SendMessage(nikName, channelName, contents[(int)(Math.random() * 4)], 10, 2);
	}
	
	/**
	 * ֻ�����ǳƵĺ������ܵ�ʵ��
	 * @param nikName ��Ϸ�ǳ�
	 */
	public static void SendMessage(String nikName) {
		String[] contents = {
				"�������",
				"��������ģ��������ҵģ������Ǻ����˵ģ�",
				"��ӭ����������ҫ��",
				"һ���˹µ��Ķ��ڲݴ����ʧ������?",
				"�������Ҳ�����"
		};
		SendMessage(nikName, "Ĭ��Ƶ��", contents[(int)(Math.random() * 4)], 10, 2);
	}
	
	
	/**
	 * ������ʵ�ֺ�������
	 * @param name ��Ϸ�ǳ�
	 * @param channelName ����Ƶ��
	 * @param message  ��������
	 * @param count ����
	 * @param interval ���
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int interval) {
		for (int i = 0; i < count; i++) {
			String value = String.format("��%s��%s��%s", channelName,name,message);
			try {
				Thread.sleep(interval * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(value);
		}
		
//		for (int i = 0; i < count; i++) {
//			System.out.println();
		
	}

}
