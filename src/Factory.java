
public class Factory {

    public static int STUDENT  = 0;
    public static int EMPLOYEE = 1;

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
