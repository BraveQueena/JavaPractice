/**
 * 
 */
package geussDubug;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2019.1.3
 * @copyright 小群子怎么那么淑女呢
 * @aim 定义玩家属性：玩家名称、分数、个性化台词、出拳
 * 方法：设置、得到玩家名字，设置得到分数，出拳
 */
public class ComPlayer {
	private String playerName;
	private int score = 10;
	public static final int messageTpyeFist = 1;
	public static final int messageTpyeWin = 2;
	public static final int messageTpyeLose = 3;
	private int fist;
	
	private String[] messageFist = {
		"必杀：摇摇晃晃拳！",
		"像我这么帅的人，躺在床上就能赚钱~~",
		"左勾拳，右勾拳！",
		"叫你一声你敢答应吗？",
		"大王叫我来巡山咯~~"
	};
	
	private String[] messageWin = {
		"子曾经曰过：“Y挺的LJYOYO，一板砖糊死你Y的！！”",
		"真相只有一个，你已经死了！！",
		"这一刻，你已经被灵魂附体，他不是一个人！",
		"抽，是一种生活艺术；找抽，是一种生活态度！",
		"“刚和我朋友下棋，他把我帅吃了”，“什么意思？”“我帅死啦！”"
	};
	
	private String[] messageLose = {
		"等有一天我修成正果，把你们这些妖孽全收了",
		"人生最大的悲哀是青春不再，青春痘却还在",
		"别逼我，再逼我 就装死给你看！",
		"再牛逼百度咋搜索不到你呢？再牛逼你能憋住尿吗?",
		"我和超人的唯一区别就是，我把内裤穿在了里面"
	};
	
	public void sendMessage(int type) {
		int index = (int)(Math.random() * 1000 % 5);
		String message = null;
		switch(type){
		case messageTpyeFist:
			message = messageFist[index];
			break;
		case messageTpyeWin:
			message = messageWin[index];
			break;
		case messageTpyeLose:
			message = messageLose[index];
			break;
		}
		System.out.print(this.getPlayerName() + "：");
		System.out.println(message);
	}
	
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {

		this.score = score;
	}
	/**
	 * @return the fist
	 */
	public int getFist() {
		fist = (int)(Math.random() * 1000 % 3) + 1;
		return fist;
	}
	/**
	 * @param fist the fist to set
	 */
//	public void setFist(int fist) {
//	
//		this.fist = fist;
//	}
	
	

}
