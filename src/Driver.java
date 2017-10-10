
public class Driver {

	public static void main(String[] args) {

		// Test
		Person person = new Person("Dan", "Peters", 16);
		System.out.println(person);

		Student student = new Student("Dan", "Peters", 16, 4.0);
		System.out.println(student);

		Employee employee = new Employee("Dan", "Peters", 16, 15.75);
		System.out.println(employee);
	}
}
