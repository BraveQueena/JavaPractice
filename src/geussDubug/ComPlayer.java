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
public class ComPlayer {
	private String playerName;
	private int score = 10;
	public static final int messageTpyeFist = 1;
	public static final int messageTpyeWin = 2;
	public static final int messageTpyeLose = 3;
	private int fist;
	
	private String[] messageFist = {
		"��ɱ��ҡҡ�λ�ȭ��",
		"������ô˧���ˣ����ڴ��Ͼ���׬Ǯ~~",
		"��ȭ���ҹ�ȭ��",
		"����һ����Ҵ�Ӧ��",
		"����������Ѳɽ��~~"
	};
	
	private String[] messageWin = {
		"������Ի������Yͦ��LJYOYO��һ��ש������Y�ģ�����",
		"����ֻ��һ�������Ѿ����ˣ���",
		"��һ�̣����Ѿ�����긽�壬������һ���ˣ�",
		"�飬��һ�������������ҳ飬��һ������̬�ȣ�",
		"���պ����������壬������˧���ˡ�����ʲô��˼��������˧��������"
	};
	
	private String[] messageLose = {
		"����һ�����޳���������������Щ����ȫ����",
		"�������ı������ഺ���٣��ഺ��ȴ����",
		"����ң��ٱ��� ��װ�����㿴��",
		"��ţ�ưٶ�զ�����������أ���ţ�����ܱ�ס����?",
		"�Һͳ��˵�Ψһ������ǣ��Ұ��ڿ㴩��������"
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
