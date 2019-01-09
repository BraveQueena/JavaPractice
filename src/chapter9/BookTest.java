/**
 * 
 */
package chapter9;

/**
 * @author 牛冠群
 * @version 1.0
 * @date
 * @copyright 小群子怎么那么淑女呢
 * @aim
 */
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("小群子历险记", "123-456", 999.9, 5);
		BookBiz bookbiz = new BookBiz();

		bookbiz.sellBook(book);
		System.out.println(book.getCount());

	}
}
