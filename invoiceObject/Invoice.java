public class Invoice {
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double price;
	private static int total;
	// static means that the ammount will increase in 

	public Invoice(String pn, String pd, int q, double p) {
		partNumber = pn;
		partDesc = pd;
		quantity = q;
		price = p;
	}
	// usually getter is public type with no parameter 
	// and setter is public void with parameter
	// static is to remain the same for all instance (affect one will affect all = total)
	

	// getter, format: public type name(no param)
	// must return something because user get
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public double getInvoiceAmount() {
		if(quantity > 0 && price > 0) {
			return quantity*price;
		} else {
			return 0.0;
		}
	}


	// setter, format: public void name(param)
	// modify unique variable in the class, no need to return because user set
	public void setPartNumber(String pn) {
		partNumber = pn;
	}

	public void setPartDesc(String pd) {
		partDesc = pd;
	}
	
	public void setPrice(double p) {
		price = p;
	}

	public void setQuantity(int q) {
		quantity = q;
	}



	// static setter, format public static void name(param)
	// modify variable in class, Applies to all other instance too.
	public static void incTotalPrice(double p) {
		total += p;
	}



}
