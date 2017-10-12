import java.util.Comparator;

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
            throw new RuntimeException("wage (" + wage + ") should not less than $0");
        }
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee " + super.toString() + ", hourly wage $" + this.wage;
    }

    // Comparator
    public static Comparator<Employee> CompareByWage = new Comparator<Employee>() {
        public int compare(Employee employee1, Employee employee2) {

            double wage1 = employee1.getWage();
            double wage2 = employee2.getWage();

            // equal
            if (wage1 == wage2) {
                return 0;
            }

            return wage1 > wage2 ? 1 : -1;
        }
    };
}
