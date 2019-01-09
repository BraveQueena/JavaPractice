/**
 * 
 */
package chapter9;

/**
 * @author ţ��Ⱥ
 * @version 1.0
 * @date 2019.1.8
 * @copyright СȺ����ô��ô��Ů��
 * @aim ͼ����Ķ�����д
 */
public class Book {

	private String name;
	private String isbn;
	private double price;
	private int count; // ��ǰ���
	
	public Book() {}
	
	public Book(String name) {
		setName(name);
	}
	
	public Book(String name, String isbn, double price, int count) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if(price < 0 ) {
			this.price = 0;
		}else {
			this.price = price;
		}

	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		if(count < 0) {
			this.count = 0;
		}else {
			this.count = count;
		}

	}

}
