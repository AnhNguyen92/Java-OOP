package main.java.exercisesOnComposition.Lab2_7;

public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;

	public Invoice(int iD, Customer customer, double amount) {
		super();
		ID = iD;
		this.customer = customer;
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getID() {
		return ID;
	}

	public String getCustomerName() {
		return this.customer.getName();
	}

	public double getAmountAfterDiscount() {
		return amount -= amount * this.customer.getDiscount() / 100;
	}
}
