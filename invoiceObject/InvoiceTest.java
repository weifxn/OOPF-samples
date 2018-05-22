public class InvoiceTest {
	// main method to display everything
	public static void main(String[] args) {

		// create instances
		Invoice inv1 = new Invoice("1234", "Hammer", 2, 14.95);
		Invoice inv2 = new Invoice("5678", "Paint Brush", -5, -9.99);

		System.out.println(inv1.getPartNumber()+" "+inv1.getPartDesc()+" "+inv1.getQuantity()+" "+inv1.getPrice()+" "+inv1.getInvoiceAmount());

		inv1.setPartNumber("001234");
		inv1.setPartDesc("Yellow Hammer");
		inv1.setQuantity(3);
		inv1.setPrice(19.49);

		System.out.println(inv1.getPartNumber()+" "+inv1.getPartDesc()+" "+inv1.getQuantity()+" "+inv1.getPrice()+" "+inv1.getInvoiceAmount());



	}
}