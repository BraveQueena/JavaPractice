package chapter9;
/**
 * 
 */

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2019.1.8
 * @copyright СȺ����ô��ô��Ů��
 * @aim ��ͼ�����ɾ���ŷ���
 */
public class BookBiz {
	
	/**
	 * ͼ������� ������۳ɹ� ����������������ʧ�� ����-1
	 * @param book
	 * @return
	 */
	public int sellBook(Book book) {
		//1���ж�ͼ��Ŀ���Ƿ����1
		//2�����-1
		//3���������۵�����
		if(!(book.getCount() > 1)) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}

}
