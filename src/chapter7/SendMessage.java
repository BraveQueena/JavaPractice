/**
 * 
 */
package chapter7;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.12.26
 * @copyright 小群子怎么那么淑女呢
 * @aim 使用重载实现游戏喊话功能
 */
public class SendMessage {
	public static void main(String[] args) {
		SendMessage("李三风","世界频道1");
	}
	
	/**
	 * 方式实现喊话
	 * @param nikName 游戏昵称
	 * @param channelName 喊话频道
	 */
	public static void SendMessage(String nikName,String channelName) {
		String[] contents = {
				"你吃了吗？",
				"世界是你的，世界是我的，世界是韩国人的！",
				"欢迎来到王者荣耀！",
				"一个人孤单的蹲在草丛里，是失恋了吗?",
				"我命由我不由天"
		};
		SendMessage(nikName, channelName, contents[(int)(Math.random() * 4)], 10, 2);
	}
	
	/**
	 * 只输入昵称的喊话功能的实现
	 * @param nikName 游戏昵称
	 */
	public static void SendMessage(String nikName) {
		String[] contents = {
				"你吃了吗？",
				"世界是你的，世界是我的，世界是韩国人的！",
				"欢迎来到王者荣耀！",
				"一个人孤单的蹲在草丛里，是失恋了吗?",
				"我命由我不由天"
		};
		SendMessage(nikName, "默认频道", contents[(int)(Math.random() * 4)], 10, 2);
	}
	
	
	/**
	 * 方法：实现喊话功能
	 * @param name 游戏昵称
	 * @param channelName 喊话频道
	 * @param message  喊话内容
	 * @param count 次数
	 * @param interval 间隔
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int interval) {
		for (int i = 0; i < count; i++) {
			String value = String.format("【%s】%s：%s", channelName,name,message);
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
