public class Student {
	private String name;
	private int semester;
	private String course;

	// constructor

	public Student(String n, int s, String c) {
		name = n;
		semester = s;
		course = c;
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int s) {
		semester = s;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String c) {
		course = c;
	}

	public boolean checkEligibility() {
		if (semester >= 4 && semester <= 6) {
			return true;
		}
		else
			return false;
	}


}
