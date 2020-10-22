package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String itemName;
	private double price;
	@Autowired
	private Restaurant restaurant;
	/**
	 * Constructor - No Argument
	 */
	public MenuItem() {
		super();
	}
	/**
	 * Constructor - itemName only
	 * @param itemName
	 */
	public MenuItem(String itemName) {
		super();
		this.itemName = itemName;
	}
	/**
	 * Constructor - itemName and price
	 * @param itemName
	 * @param price
	 */
	public MenuItem(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	/**
	 * Constructor - No id Argument
	 * @param itemName
	 * @param price
	 * @param restaurant
	 */
	public MenuItem(String itemName, double price, Restaurant restaurant) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.restaurant = restaurant;
	}
	/**
	 * Constructor - ALL Arguments
	 * @param id
	 * @param itemName
	 * @param price
	 * @param restaurant
	 */
	public MenuItem(long id, String itemName, double price, Restaurant restaurant) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.restaurant = restaurant;
	}
	/**
	 * Setters and getters
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	/**
	 * toString - format for output
	 */
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", itemName=" + itemName + ", price=" + price + ", restaurant=" + restaurant
				+ "]";
	}
	
	
}
