
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private static List<Employee> employeeList = new ArrayList<Employee>();

    private static void generateList () {
        Employee employee1 = (Employee) Factory.createPerson(Person.EMPLOYEE, "Leon", "Huang", 28, 15.0);
        Employee employee2 = (Employee) Factory.createPerson(Person.EMPLOYEE, "Peter", "Huang", 22, 25.0);
        Employee employee3 = (Employee) Factory.createPerson(Person.EMPLOYEE, "Zoey", "Yung", 23, 13.5);
        Employee employee4 = (Employee) Factory.createPerson(Person.EMPLOYEE, "Michelle", "Cheng", 22, 12.5);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }

    private static void showList () {
        for (Employee stu : employeeList) {
            System.out.println(stu);
        }
    }

    private static void sortByWage () {
        Collections.sort(employeeList, Employee.CompareByWage);
    }

    public static void demo () {
        System.out.println("=================COMPANY=================");
        generateList();

        System.out.println("BEFORE:");
        showList();

        sortByWage();

        System.out.println("\nAFTER:");
        showList();
    }
}
