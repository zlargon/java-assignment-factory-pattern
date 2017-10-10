
public class Student extends Person {
	private double GPA;

	// Constructor
	public Student (final String firstName, final String lastName, final int age, final double gpa) {
		super(firstName, lastName, age);
		this.setGPA(gpa);
	}

	// GPA getter & setter
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gpa) {
		if (gpa < 0 || gpa > 4) {
			throw new RuntimeException("GPA (" + gpa + ") should range between 0.0 and 4.0");
		}
		GPA = gpa;
	}


	@Override
	public String toString() {
		return "Student " + super.toString() + ", GPA " + this.GPA;
	}
}
