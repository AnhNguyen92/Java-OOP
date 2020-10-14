package main.java.OOPMore.Lab7_1;

public class DiscountRate {
	private double serviceDiscountPremium = 0.2;
	private double serviceDiscountGold = 0.15;
	private double serviceDiscountSilver = 0.1;
	private double productDiscountPremium = 0.1;
	private double productDiscountGold = 0.1;
	private double productDiscountSilver = 0.1;

	public double getServiceDiscountRate(String type) {
		double discountRate = serviceDiscountSilver;
		switch (type) {
		case "Premium":
			discountRate = serviceDiscountPremium;
			break;
		case "Gold":
			discountRate = serviceDiscountGold;
			break;
		default: // Silver
			break;
		}

		return discountRate;
	}

	public double getProductDiscountRate(String type) {
		double discountRate = productDiscountSilver;
		switch (type) {
		case "Premium":
			discountRate = productDiscountPremium;
			break;
		case "Gold":
			discountRate = productDiscountGold;
			break;
		default: // Silver
			break;
		}

		return discountRate;
	}

}
