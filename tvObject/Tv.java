public class Tv {
	private String stockNo;
	private String make;
	private char type;
	private double price;
	
	public Tv(String stockNo, String make, char type, double price) {
		this.stockNo = stockNo;
		this.make = make;
		this.type = type;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPriceAfterTax(double rateOfTax) {
		double tax;
		tax = getPrice() * rateOfTax/100;
		return tax;
	}
}

