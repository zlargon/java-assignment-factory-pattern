import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Employee extends Person  {
    private double wage;


    public static List<Employee> parseCSV (final String filePath) {

            Scanner input = null;
            List<Employee> list = new ArrayList<Employee>();

            try {
                input = new Scanner(new File(filePath));

                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    Scanner scan = new Scanner(line);
                    scan.useDelimiter(",");

                    // check the type
                    int type = scan.nextInt();
                    if (type != Person.EMPLOYEE) {
                        continue;
                    }

                    // fetch data
                    String firstName = scan.next();
                    String lastName = scan.next();
                    int age = scan.nextInt();
                    double wage = scan.nextDouble();

                    // add employee to list
                    Employee employee = (Employee) Factory.createPerson(type, firstName, lastName, age, wage);
                    list.add(employee);

                    // scan close
                    scan.close();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                input.close();
            }
            return list;
    }

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
