package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Restaurant {
	private String name;
	private String phone;
	/**
	 * Constructor - No Arguments
	 */
	public Restaurant() {
		super();
	}
	/**
	 * Constructor - All Arguments
	 * @param name
	 * @param phone
	 */
	public Restaurant(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	/**
	 * Setters and Getters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * toString - formated for output
	 */
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + "]";
	}
	
}
