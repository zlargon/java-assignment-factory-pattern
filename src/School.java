import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {

    private static List<Student> studentList = new ArrayList<Student>();

    private static void generateList () {
        Student student1 = (Student) Factory.createPerson(Person.STUDENT, "Leon", "Huang", 28, 4.0);
        Student student2 = (Student) Factory.createPerson(Person.STUDENT, "Peter", "Huang", 22, 3.0);
        Student student3 = (Student) Factory.createPerson(Person.STUDENT, "Zoey", "Yung", 23, 3.5);
        Student student4 = (Student) Factory.createPerson(Person.STUDENT, "Michelle", "Cheng", 22, 3.2);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

    private static void showList () {
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }

    private static void sortByGPA () {
        Collections.sort(studentList, Student.CompareByGPA);
    }

    public static void demo () {
        System.out.println("=================SCHOOL=================");
        studentList = Student.parseCSV("people.csv");

        System.out.println("BEFORE:");
        showList();

        sortByGPA();

        System.out.println("\nAFTER:");
        showList();
    }
}
