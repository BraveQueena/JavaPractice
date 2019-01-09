
package chapter2;
/**
 * 定义变量
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class VarDemo {
	
	public static void main(String[] args) {
		
		System.out.println("某吃货采购清单：");
		System.out.println("商品名称\t单价\t数量\t价格\t备注");
		String goodName1 = "德芙巧克力";   //商品名称
		double price1 = 30.9;   //单价
		int count1 = 10;   //数量
		String remark1 = "此刻尽享丝滑";
		
		System.out.printf("%s\t%.2f\t%d\t%s\n\n",goodName1,price1,count1,remark1);
		System.out.println(goodName1+"\t"+price1+"\t"+count1+"\t"+remark1+"\n\n");
		
		String brand = "华硕ASUS" ;//品牌
		String type = "GTX 1080";  //类型
		int hz =1569;
		float length = 29.8f;
		float width = 13.4f;
		double height = 5.25;
		
		//打印变量
		System.out.println("品牌："+brand);
		System.out.println("型号："+type);
		System.out.println("核心频率："+hz+"MHz");
		System.out.println("长宽高："+length+"\t"+width+"\t"+height);
	}
}
