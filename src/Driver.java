
public class Driver {

    public static void main(String[] args) {
        School.demo();
        System.out.println("");
        Company.demo();
    }

//   Console Output:
//
//    =================SCHOOL=================
//    BEFORE:
//    Student Leon Huang, age 28, GPA 4.0
//    Student Peter Huang, age 22, GPA 3.0
//    Student Zoey Yung, age 23, GPA 3.5
//    Student Michelle Cheng, age 22, GPA 3.2
//
//    AFTER:
//    Student Peter Huang, age 22, GPA 3.0
//    Student Michelle Cheng, age 22, GPA 3.2
//    Student Zoey Yung, age 23, GPA 3.5
//    Student Leon Huang, age 28, GPA 4.0
//
//    =================COMPANY=================
//    BEFORE:
//    Employee Leon Huang, age 28, hourly wage $15.0
//    Employee Peter Huang, age 22, hourly wage $25.0
//    Employee Zoey Yung, age 23, hourly wage $13.5
//    Employee Michelle Cheng, age 22, hourly wage $12.5
//
//    AFTER:
//    Employee Michelle Cheng, age 22, hourly wage $12.5
//    Employee Zoey Yung, age 23, hourly wage $13.5
//    Employee Leon Huang, age 28, hourly wage $15.0
//    Employee Peter Huang, age 22, hourly wage $25.0
}
