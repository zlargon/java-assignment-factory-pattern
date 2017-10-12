import java.util.Comparator;

public class Person {
    private String firstName;
    private String LastName;
    private int age;

    // Constructor
    public Person (final String firstName, final String lastName, final int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    // First Name getter & setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(final String fisrtName) {
        if (fisrtName == null || fisrtName.length() == 0) {
            throw new RuntimeException("Last Name (" + fisrtName + ") should not be null or empty");
        }
        this.firstName = fisrtName;
    }

    // Last Name getter & setter
    public String getLastName() {
        return LastName;
    }
    public void setLastName(final String lastName) {
        if (lastName == null || lastName.length() == 0) {
            throw new RuntimeException("Last Name (" + lastName + ") should not be null or empty");
        }
        LastName = lastName;
    }

    // Age getter & setter
    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        if (age <= 0) {
            throw new RuntimeException("Age (" + age + ") should not less than 0");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.LastName + ", age " + this.age;
    }

    // Comparator
    public static Comparator<Person> CompareByAge = new Comparator<Person>() {
        public int compare(Person person1, Person person2) {
            return person1.getAge() - person2.getAge();
        }
    };
}
