public class House {
	private String color;
	private int price;

	public House(String c, int p) {
		color = c;
		price = p;
		
	}
 
	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		price = p;
	}
}