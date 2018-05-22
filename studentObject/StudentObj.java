import java.util.ArrayList;

public class StudentObj {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		Student student1, student2;

		student1 = new Student("Alex",5,"BCS");
		student2 = new Student("Mindy",2,"BIT");

		students.add(student1);
		students.add(student2);

		System.out.println(student1.getName());

		student1.setName("Johnson");

		System.out.println(student1.getName());

		for(Student s: students) {
			System.out.print(s.getName());
			System.out.print(s.checkEligibility()? " is eligible": " is not eligible");
			System.out.print(" to get credit exemption.");
			System.out.println();
		}




		

	}		

		
}
