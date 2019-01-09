/**
 * 
 */
package geussDubug;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2019.1.3
 * @copyright СȺ����ô��ô��Ů��
 * @aim ����������ԣ�������ơ����������Ի�̨�ʡ���ȭ
 * ���������á��õ�������֣����õõ���������ȭ
 */
public class HumanPlayer {
	private String playerName;
	private int score = 10;
	public static final int messageTpyeFist = 1;
	public static final int messageTpyeWin = 2;
	public static final int messageTpyeLose = 3;
	private int fist;
	
	private String[] messageFist = {
		"���йⲨ��biu biu biu~",
		"���������ı���Ϊʲô��ô��",
		"��ɱ��©PP������~~",
		"����ϲ�����ཷ�",
		"�ز�����ŷ��ɣ������һȭ~~"
	};
	
	private String[] messageWin = {
		"����˭~",
		"��ȭ���е���˼~~",
		"god like",
		"ȫ������~",
		"���Ż�����Ÿ裬Ȼ���������~"
	};
	
	private String[] messageLose = {
		"ͨ���ɹ��ĵ�·������ʩ��",
		"�ȵ���ˮ��ȥ����֪��˭����Ӿ��~",
		"������ǲ��ã����ʱ�����������綼û�úȡ�����",
		"���������ˣ���QQ���ϣ�����̣��ú�����һ���������ô���̫����QQ",
		"���˽����Ҷ��ѣ����������Ҷ���"	
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
		System.out.print(this.getPlayerName() + "��");
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
