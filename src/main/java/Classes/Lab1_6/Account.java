package main.java.Classes.Lab1_6;

public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}
