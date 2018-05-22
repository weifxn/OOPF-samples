public class Employee {
	// vars
	private String name;
	private double salary;
	private static double total;

	// const
	public Employee(String n, double s) {
		name = n;
		salary = s;
		// set total
		increaseTotal(s);
	}

	// getter
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static double getTotalSalary() {
		return total;
	}



	// setter
	public void setName(String n) {
		name = n;
	}

	public void setSalary(double s) {
		salary = s;
		increaseTotal(s);
	}

	public void increaseSalary(int i) {
		if(i > 0) {
			double incPercent = salary*i/100;
			salary += incPercent;
			increaseTotal(incPercent);
		}
	}

	public static void increaseTotal(double t) {
		if(t > 0) {
			total += t;
		}
	}

	public void display() {
		System.out.println(getName()+" "+getSalary());
	}
}