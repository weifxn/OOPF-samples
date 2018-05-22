public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("a", 1200);
		Employee e2 = new Employee("b", 2200);

		e1.display();
		e2.display();

		e1.increaseSalary(10);
		e2.increaseSalary(10);

		e1.display();
		e2.display();

		System.out.println(Employee.getTotalSalary());


	}
}