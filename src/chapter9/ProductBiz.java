/**
 * 
 */
package chapter9;

import javax.swing.JOptionPane;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2018.01.08
 * @copyright 小群子怎么那么淑女呢
 * @aim  商品购买总价计算
 */
public class ProductBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product[] products = new Product[3];
		int[] counts = new int[3];
		double total = 0;
		System.out.println("商品名称\t单价\t数量");
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)  //==非赋值    =为赋值
			products[i] = new Product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			products[i].setName(name);
			String strPrice = JOptionPane.showInputDialog("请输入商品数量；");
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入该商品单价：");
			products[i].setCount(Integer.parseInt(strCount));

			System.out.println(products[i].getName() + "\t" + products[i].getPrice() + "\t" + products[i].getCount());
			total += products[i].getPrice() * products[i].getCount();
		}
		System.out.println("商品的总价为：" + total);

	}

}
