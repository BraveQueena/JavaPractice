/**
 * 
 */
package geussDubug;

import java.util.Scanner;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2019.1.3
 * @copyright 小群子怎么那么淑女呢
 * @aim 出拳小遊戲
 */
public class GameCore {
	private int roomId;
	private String roomName;
	private int roomPass;
	HumanPlayer player1 = null;
	ComPlayer player2 = null;
	private int fist1;
	private int fist2;
	private Object thread;
	
	public GameCore(){
		iniGame();
		showMenu();
		startGame();
		endGame();
	}
	
	/**
	 * 
	 */
	private void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n欢迎进入蜡笔小新猜拳游戏！");
		System.out.println("出拳规则：\n1-剪刀；2-石头；3-布");
		System.out.println("对手：1-妮妮；2-风间；3-正南；4-阿呆");
		System.out.print("请选择你的对手：");
		Scanner input = new Scanner(System.in);
		String[] fighter = {
			"妮妮","风间","正南","阿呆"	
		};
		int choice = input.nextInt();
		System.out.println("对局开始！野原新之助 VS " + fighter[choice - 1]);
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
		System.out.println();
		player1.setPlayerName("野原新之助");
		player2.setPlayerName(fighter[choice - 1]);
	}

	/**
	 * 
	 */
	private void endGame() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}
	/**
	 * 
	 */
	private void startGame() {
		while(true) {
		// TODO Auto-generated method stub
		System.out.print("野原新之助请出拳：");
		fist1 = new Scanner(System.in).nextInt();
		fist2 = new ComPlayer().getFist();
		String fists[] = {"剪刀","石头","步"};
		int index1 = fist1 - 1;
		int index2 = fist2 - 1;
		System.out.println("野原新之助出拳：" + fists[index1]);
		System.out.println(player2.getPlayerName() + "出拳：" + fists[index2]);
		//判断
		if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 ==1 || fist1 == 3 && fist2 == 2) {
			System.out.println("【吉永老师】：野原新之助获胜！");
//			System.out.print(player1.getPlayerName() + "：");
			player1.sendMessage(HumanPlayer.messageTpyeWin);
//			System.out.print(player2.getPlayerName() + "：");
			player2.sendMessage(ComPlayer.messageTpyeLose);
		}else if(fist1 == fist2){
			System.out.println("【吉永老师】；两人打平！");
//			System.out.print(player1.getPlayerName() + "：");
			player1.sendMessage(HumanPlayer.messageTpyeFist);
//			System.out.print(player2.getPlayerName() + "：");
			player2.sendMessage(ComPlayer.messageTpyeFist);
		}else {
			System.out.println(player2.getPlayerName() + "获胜！");
//			System.out.print(player2.getPlayerName() + "：");
			player2.sendMessage(ComPlayer.messageTpyeWin);
//			System.out.print(player2.getPlayerName() + "：");
			player1.sendMessage(HumanPlayer.messageTpyeLose);
		}

		System.out.println("是否继续游戏？y/n：");
		String answer = new Scanner(System.in).next();
		if(!("y".equalsIgnoreCase(answer))) {
			break;
		}
		}
		System.out.println("游戏结束！");
	}
	/**
	 * 
	 */
	private void iniGame() {
		// TODO Auto-generated method stub
		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		for (int i = 0; i < 15; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("游戏加载完毕");
		for (int i = 0; i < 15; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	/**
	 * @return the roomPass
	 */
	public int getRoomPass() {
		return roomPass;
	}
	/**
	 * @param roomPass the roomPass to set
	 */
	public void setRoomPass(int roomPass) {
		this.roomPass = roomPass;
	}
	

}
