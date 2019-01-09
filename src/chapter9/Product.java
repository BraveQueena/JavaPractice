/**
 * 
 */
package chapter9;

/**
 * @author 牛冠群
 * @version 1.0
 * @date 商品类实体
 * @copyright 小群子怎么那么淑女呢
 * @aim 2018.01.08
 */
public class Product {
	private String name;
	private double price;
	private int count;
	private String description;
	private String services;
	
	public Product() {}
	
	public Product(String name) {
		setName(name);
	}
	
	public Product(String name, int count) {
		setName(name);
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
		this.count = count;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the services
	 */
	public String getServices() {
		return services;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(String services) {
		this.services = services;
	}

}
