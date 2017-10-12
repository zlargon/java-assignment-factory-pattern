
public class Factory {

    public static final int STUDENT  = 0;
    public static final int EMPLOYEE = 1;

    public static Person createPerson(int type, String firstName, String lastName, int age, double gpaOrWage) {

        if (type == STUDENT) {
            return new Student(firstName, lastName, age, gpaOrWage);
        }

        if (type == EMPLOYEE) {
            return new Employee(firstName, lastName, age, gpaOrWage);
        }

        return new Person(firstName, lastName, age);
    }
}
