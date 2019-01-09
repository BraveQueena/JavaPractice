package chapter9;
/**
 * 
 */

/**
 * @author 牛冠群
 * @version 1.0
 * @date 2019.1.8
 * @copyright 小群子怎么那么淑女呢
 * @aim 对图书的增删改排方法
 */
public class BookBiz {
	
	/**
	 * 图书的销售 如果销售成功 返回销售量；销售失败 返回-1
	 * @param book
	 * @return
	 */
	public int sellBook(Book book) {
		//1、判断图书的库存是否大于1
		//2、库存-1
		//3、返回销售的数量
		if(!(book.getCount() > 1)) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}

}
