import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private double GPA;

    public static List<Student> parseCSV (final String filePath) {

            Scanner input = null;
            List<Student> list = new ArrayList<Student>();

            try {
                input = new Scanner(new File(filePath));

                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    Scanner scan = new Scanner(line);
                    scan.useDelimiter(",");

                    // check the type
                    int type = scan.nextInt();
                    if (type != Person.STUDENT) {
                        continue;
                    }

                    // fetch data
                    String firstName = scan.next();
                    String lastName = scan.next();
                    int age = scan.nextInt();
                    double gpa = scan.nextDouble();

                    // add student to list
                    Student student = (Student) Factory.createPerson(type, firstName, lastName, age, gpa);
                    list.add(student);

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
    public Student (final String firstName, final String lastName, final int age, final double gpa) {
        super(firstName, lastName, age);
        this.setGPA(gpa);
    }

    // GPA getter & setter
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gpa) {
        if (gpa < 0 || gpa > 4) {
            throw new RuntimeException("GPA (" + gpa + ") should range between 0.0 and 4.0");
        }
        GPA = gpa;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() + ", GPA " + this.GPA;
    }

    // Comparator
    public static Comparator<Student> CompareByGPA = new Comparator<Student>() {
        public int compare(Student student1, Student student2) {

            double gpa1 = student1.getGPA();
            double gpa2 = student2.getGPA();

            // equal
            if (gpa1 == gpa2) {
                return 0;
            }

            return gpa1 > gpa2 ? 1 : -1;
        }
    };
}
