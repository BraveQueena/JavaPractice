/**
 * 
 */
package chapter9;

import javax.swing.JOptionPane;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2018.01.08
 * @copyright СȺ����ô��ô��Ů��
 * @aim  ��Ʒ�����ܼۼ���
 */
public class ProductBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product[] products = new Product[3];
		int[] counts = new int[3];
		double total = 0;
		System.out.println("��Ʒ����\t����\t����");
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)  //==�Ǹ�ֵ    =Ϊ��ֵ
			products[i] = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			products[i].setName(name);
			String strPrice = JOptionPane.showInputDialog("��������Ʒ������");
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("���������Ʒ���ۣ�");
			products[i].setCount(Integer.parseInt(strCount));

			System.out.println(products[i].getName() + "\t" + products[i].getPrice() + "\t" + products[i].getCount());
			total += products[i].getPrice() * products[i].getCount();
		}
		System.out.println("��Ʒ���ܼ�Ϊ��" + total);

	}

}
