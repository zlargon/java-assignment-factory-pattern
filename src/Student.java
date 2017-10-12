import java.util.Comparator;

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

	// Comparator
	public static Comparator<Student> CompareByGPA = new Comparator<Student>() {
		public int compare(Student student1, Student student2) {

			double gpa1 = student1.getGPA();
			double gpa2 = student2.getGPA();

			// equal
			if (gpa1 == gpa2) {
				return 0;
			}

			return gpa1 > gpa2 ? 1 : -1;
		}
	};
}
