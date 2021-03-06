package main.java.Composition.Lab2_7;

public class Customer {
	private int ID;
	private String name;
	private int discount;

	public Customer(int iD, String name, int discount) {
		ID = iD;
		this.name = name;
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", discount=" + discount + "]";
	}

}
