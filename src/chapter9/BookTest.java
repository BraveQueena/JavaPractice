/**
 * 
 */
package chapter9;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date
 * @copyright СȺ����ô��ô��Ů��
 * @aim
 */
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("СȺ�����ռ�", "123-456", 999.9, 5);
		BookBiz bookbiz = new BookBiz();

		bookbiz.sellBook(book);
		System.out.println(book.getCount());

	}
}
