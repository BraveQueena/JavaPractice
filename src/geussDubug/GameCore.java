/**
 * 
 */
package geussDubug;

import java.util.Scanner;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2019.1.3
 * @copyright СȺ����ô��ô��Ů��
 * @aim ��ȭС�[��
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
		System.out.println("\n��ӭ��������С�²�ȭ��Ϸ��");
		System.out.println("��ȭ����\n1-������2-ʯͷ��3-��");
		System.out.println("���֣�1-���ݣ�2-��䣻3-���ϣ�4-����");
		System.out.print("��ѡ����Ķ��֣�");
		Scanner input = new Scanner(System.in);
		String[] fighter = {
			"����","���","����","����"	
		};
		int choice = input.nextInt();
		System.out.println("�Ծֿ�ʼ��Ұԭ��֮�� VS " + fighter[choice - 1]);
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
		System.out.println();
		player1.setPlayerName("Ұԭ��֮��");
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
		System.out.print("Ұԭ��֮�����ȭ��");
		fist1 = new Scanner(System.in).nextInt();
		fist2 = new ComPlayer().getFist();
		String fists[] = {"����","ʯͷ","��"};
		int index1 = fist1 - 1;
		int index2 = fist2 - 1;
		System.out.println("Ұԭ��֮����ȭ��" + fists[index1]);
		System.out.println(player2.getPlayerName() + "��ȭ��" + fists[index2]);
		//�ж�
		if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 ==1 || fist1 == 3 && fist2 == 2) {
			System.out.println("��������ʦ����Ұԭ��֮����ʤ��");
//			System.out.print(player1.getPlayerName() + "��");
			player1.sendMessage(HumanPlayer.messageTpyeWin);
//			System.out.print(player2.getPlayerName() + "��");
			player2.sendMessage(ComPlayer.messageTpyeLose);
		}else if(fist1 == fist2){
			System.out.println("��������ʦ�������˴�ƽ��");
//			System.out.print(player1.getPlayerName() + "��");
			player1.sendMessage(HumanPlayer.messageTpyeFist);
//			System.out.print(player2.getPlayerName() + "��");
			player2.sendMessage(ComPlayer.messageTpyeFist);
		}else {
			System.out.println(player2.getPlayerName() + "��ʤ��");
//			System.out.print(player2.getPlayerName() + "��");
			player2.sendMessage(ComPlayer.messageTpyeWin);
//			System.out.print(player2.getPlayerName() + "��");
			player1.sendMessage(HumanPlayer.messageTpyeLose);
		}

		System.out.println("�Ƿ������Ϸ��y/n��");
		String answer = new Scanner(System.in).next();
		if(!("y".equalsIgnoreCase(answer))) {
			break;
		}
		}
		System.out.println("��Ϸ������");
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
		System.out.print("��Ϸ�������");
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
