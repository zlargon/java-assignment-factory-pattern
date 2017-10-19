
public class Factory {

    public static Person createPerson(int type, String firstName, String lastName, int age, double gpaOrWage) {

        if (type == Person.STUDENT) {
            return new Student(firstName, lastName, age, gpaOrWage);
        }

        if (type == Person.EMPLOYEE) {
            return new Employee(firstName, lastName, age, gpaOrWage);
        }

        return new Person(firstName, lastName, age);
    }
}
