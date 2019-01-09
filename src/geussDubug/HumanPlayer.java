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
public class HumanPlayer {
	private String playerName;
	private int score = 10;
	public static final int messageTpyeFist = 1;
	public static final int messageTpyeWin = 2;
	public static final int messageTpyeLose = 3;
	private int fist;
	
	private String[] messageFist = {
		"动感光波：biu biu biu~",
		"大象大象你的鼻子为什么那么长",
		"必杀：漏PP外星人~~",
		"大姐姐喜欢吃青椒嘛？",
		"胸部扁扁的欧巴桑，吃我一拳~~"
	};
	
	private String[] messageWin = {
		"还有谁~",
		"猜拳，有点意思~~",
		"god like",
		"全军出击~",
		"吃着火锅唱着歌，然后你就输了~"
	};
	
	private String[] messageLose = {
		"通往成功的道路总是在施工",
		"等到潮水退去，就知道谁在裸泳啦~",
		"夏天就是不好，穷的时候我连西北风都没得喝。。。",
		"将来我死了，把QQ捐给希望工程，让孩子们一上来就能用带着太阳的QQ",
		"众人皆醉我独醒，举世皆浊我独清"	
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
		return fist;
	}
	/**
	 * @param fist the fist to set
	 */
	public void setFist(int fist) {
		this.fist = fist;
	}
	
	

}
