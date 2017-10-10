
public class Employee extends Person  {
	private double wage;

	// Constructor
	public Employee (final String firstName, final String lastName, final int age, final double wage) {
		super(firstName, lastName, age);
		this.setWage(wage);
	}

	// wage getter & setter
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if (wage < 0) {
			throw new RuntimeException("wage ( + wage + ) should not less than $0");
		}
		this.wage = wage;
	}


	@Override
	public String toString() {
		return "Employee " + super.toString() + ", hourly wage $" + this.wage;
	}
}
