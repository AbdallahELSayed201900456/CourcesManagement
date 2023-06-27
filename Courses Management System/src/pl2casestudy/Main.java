/*
Helwan University             Faculty of Computers & Information
Object Oriented Programming          CS213 Fall 2017
(Section #6)
@author: Tamer Abd-Elaziz Yassen
Teaching Assistant, Computer Science Dept.,
Faculty of computers and information.,
Helwan University, Cairo, Egypt.
 */
package pl2casestudy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tamer A.Yassen
 */
public class Main {

    public static Department cs = new Department("1", "CS", "Computer Science");
    public static Department is = new Department("1", "IS", "Information System");
    public static Department it = new Department("1", "IT", "Information Technology");
    public static Department sw = new Department("1", "SW", "Software Engineering");
    public static Department sa = new Department("0", "SA", "Student Affairs");

    public static void main(String[] args) {
        
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
	checkDirectoryContents(currentDir);
        
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Admin@yahoo.com", "12345678", 1, "admin", "admin", 35, 5500, sa);
        /*     
        admin.addNewEmp("SA_1", "12345678", 1, "Shaima", "Ali", 35, 3500, sa);
        admin.addNewEmp("SA_2", "12345679", 2, "Fatma", "khalid", 34, 3800, sa);
        
        admin.addNewProf("Prof_1", "12345678", 1, "Ayman", "Ezzat", 30, 8000, "Mon 12pm to 2pm", cs);
        admin.addNewProf("Prof_2", "12345679", 2, "Waleed", "Youssef", 35, 8500, "Mon 2pm to 6pm", cs);
        
        admin.addNewTA("TA_1", "12345678", 1, "Tamer", "Yassen", 25, 5000, "Sun 10am to 12pm", cs);
        admin.addNewTA("TA_2", "12345679", 2, "Wael", "Eid", 23, 6000, "Sun 11am to 1pm", cs);
     
        admin.addNewStudent("STU_1", "12345678", 20140011, "Ahmed", "Ali", 20, 2, 3.5, cs);
        admin.addNewStudent("STU_2", "12345679", 20140015, "Mostafa", "Ebrahim", 19, 1, 3.2, cs);
        
        admin.addNewCourse("PL2", "CS213", 100);
        admin.addNewCourse("SW2", "CS352", 100);
         */
        int ch = 1;

        String userName, Pass, Fname, Lname, Hours, Cname, Cid, oldCID;
        int id, oldID, age, level, maxGrade;
        double salary, GPA;
        System.out.print("\n\nWelecome Admin ... !\n\nUser Name : ");
        userName = input.next();
        System.out.print("Password  : ");
        Pass = input.next();
        if (admin.login(userName, Pass)) {

            while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + "| Enter 1: Add New Student.     |\n\t| Enter 2: Add New Professor.   |\n\t| Enter 3: Add New TA.          |\n\t| Enter 4: Add New Employee.    |\n\t| Enter 5: Add New Course.      |"
                        + "\n\t| Enter 6: Display All Students.|\n\t| Enter 7: Display Professors.  |\n\t| Enter 8: Display All TAs.     |\n\t| Enter 9: Display All Employees|\n\t| Enter 10: Display Course.     |"
                        + "\n\t| Enter 11: Search Student.     |\n\t| Enter 12: Search Professor.   |\n\t| Enter 13: Search TA.          |\n\t| Enter 14: Search Employee.    |\n\t| Enter 15: Search Course.      |"
                        + "\n\t| Enter 16: Update Student.     |\n\t| Enter 17: Update Professor.   |\n\t| Enter 18: Update TA.          |\n\t| Enter 19: Update Employee.    |\n\t| Enter 20: Update Course.      |"
                        + "\n\t| Enter 21: Delete Student.     |\n\t| Enter 22: Delete Professor.   |\n\t| Enter 23: Delete TA.          |\n\t| Enter 24: Delete Employee.    |\n\t| Enter 25: Delete Course.      |"
                        + "\n\t -------------------------------\n\t");
                ch = input.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter Student Info ... ");
                        System.out.print("Student First Name : ");
                        Fname = input.next();
                        System.out.print("Student Last Name : ");
                        Lname = input.next();
                        System.out.print("Student ID : ");
                        id = input.nextInt();
                        System.out.print("Student Age : ");
                        age = input.nextInt();
                        System.out.print("Student Level : ");
                        level = input.nextInt();
                        System.out.print("Student GPA : ");
                        GPA = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        admin.addNewStudent(userName, Pass, id, Fname, Lname, age, level, GPA, cs);
                        break;
                    case 2:
                        System.out.println("Enter Professor Info ... ");
                        System.out.print("Professor First Name : ");
                        Fname = input.next();
                        System.out.print("Professor Last Name : ");
                        Lname = input.next();
                        System.out.print("Professor ID : ");
                        id = input.nextInt();
                        System.out.print("Professor Age : ");
                        age = input.nextInt();
                        System.out.print("Professor Office Hours : ");
                        Hours = input.next();
                        System.out.print("Professor Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        admin.addNewProf(userName, Pass, id, Fname, Lname, age, salary, Hours, cs);

                        break;
                    case 3:
                        System.out.println("Enter Teaching Assistant Info ... ");
                        System.out.print("TA First Name : ");
                        Fname = input.next();
                        System.out.print("TA Last Name : ");
                        Lname = input.next();
                        System.out.print("TA ID : ");
                        id = input.nextInt();
                        System.out.print("TA Age : ");
                        age = input.nextInt();
                        System.out.print("TA Academic Hours : ");
                        Hours = input.next();
                        System.out.print("TA Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        admin.addNewTA(userName, Pass, id, Fname, Lname, age, salary, Hours, cs);

                        break;

                    case 4:
                        System.out.println("Enter Student Affairs Emp Info ... ");
                        System.out.print("Emp First Name : ");
                        Fname = input.next();
                        System.out.print("Emp Last Name : ");
                        Lname = input.next();
                        System.out.print("Emp ID : ");
                        id = input.nextInt();
                        System.out.print("Emp Age : ");
                        age = input.nextInt();
                        System.out.print("Emp Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        admin.addNewEmp(userName, Pass, id, Fname, Lname, age, salary, sa);

                        break;
                    case 5:
                        System.out.println("Enter Course Info ... ");
                        System.out.print("Course Name : ");
                        Cname = input.next();
                        System.out.print("Course Code : ");
                        Cid = input.next();
                        System.out.print("Max Grade : ");
                        maxGrade = input.nextInt();

                        admin.addNewCourse(Cname, Cid, maxGrade);

                        break;
                    case 6:
                        admin.displayStudents();
                        break;

                    case 7:
                        admin.displayProfs();
                        break;

                    case 8:
                        admin.displayTAs();
                        break;

                    case 9:
                        admin.displayEmployees();
                        break;

                    case 10:
                        admin.displayCourses();
                        break;
                    case 11:
                        System.out.print("\nSearch for Student ...!\nEnter Student ID : ");
                        id = input.nextInt();
                        admin.searchForStudent(id);
                        break;
                    case 12:
                        System.out.print("\nSearch for Prof ...!\nEnter Prof ID : ");
                        id = input.nextInt();
                        admin.searchForProf(id);
                        break;
                    case 13:
                        System.out.print("\nSearch for TA ...!\nEnter TA ID : ");
                        id = input.nextInt();
                        admin.searchForTA(id);
                        break;

                    case 14:
                        System.out.print("\nSearch for Emp ...!\nEnter Emp ID : ");
                        id = input.nextInt();
                        admin.searchForEmp(id);
                        break;
                    case 15:
                        System.out.print("\nSearch for Course ...!\nEnter Course ID : ");
                        Cid = input.next();
                        admin.searchForCourse(Cid);
                        break;
                    case 16:
                        System.out.print("\nUpdate Student info ...!\nEnter Student OldID : ");
                        oldID = input.nextInt();

                        System.out.println("\nEnter Student New Info ... ");
                        System.out.print("Student First Name : ");
                        Fname = input.next();
                        System.out.print("Student Last Name : ");
                        Lname = input.next();
                        System.out.print("Student ID : ");
                        id = input.nextInt();
                        System.out.print("Student Age : ");
                        age = input.nextInt();
                        System.out.print("Student Level : ");
                        level = input.nextInt();
                        System.out.print("Student GPA : ");
                        GPA = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        Student x = new Student(userName, Pass, id, Fname, Lname, age, level, GPA, cs);

                        admin.updateStudent(oldID, x);
                        break;

                    case 17:
                        System.out.print("\nUpdate Prof info ...!\nEnter Prof OldID : ");
                        oldID = input.nextInt();
                        System.out.println("Enter Professor Info ... ");
                        System.out.print("Professor First Name : ");
                        Fname = input.next();
                        System.out.print("Professor Last Name : ");
                        Lname = input.next();
                        System.out.print("Professor ID : ");
                        id = input.nextInt();
                        System.out.print("Professor Age : ");
                        age = input.nextInt();
                        System.out.print("Professor Office Hours : ");
                        Hours = input.next();
                        System.out.print("Professor Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        Professor y = new Professor(userName, Pass, id, Fname, Lname, age, salary, Hours, cs);
                        admin.updateProf(oldID, y);
                        break;
                    case 18:
                        System.out.print("\nUpdate TA info ...!\nEnter TA OldID : ");
                        oldID = input.nextInt();
                        System.out.println("Enter Teaching Assistant Info ... ");
                        System.out.print("TA First Name : ");
                        Fname = input.next();
                        System.out.print("TA Last Name : ");
                        Lname = input.next();
                        System.out.print("TA ID : ");
                        id = input.nextInt();
                        System.out.print("TA Age : ");
                        age = input.nextInt();
                        System.out.print("TA Academic Hours : ");
                        Hours = input.next();
                        System.out.print("TA Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        TeachingAssistant z = new TeachingAssistant(userName, Pass, id, Fname, Lname, age, salary, Hours, cs);
                        admin.updateTA(oldID, z);
                        break;

                    case 19:
                        System.out.print("\nUpdate Emp info ...!\nEnter Emp OldID : ");
                        oldID = input.nextInt();
                        System.out.println("Enter Student Affairs Emp Info ... ");
                        System.out.print("Emp First Name : ");
                        Fname = input.next();
                        System.out.print("Emp Last Name : ");
                        Lname = input.next();
                        System.out.print("Emp ID : ");
                        id = input.nextInt();
                        System.out.print("Emp Age : ");
                        age = input.nextInt();
                        System.out.print("Emp Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();

                        studentAffairsEmp w = new studentAffairsEmp(userName, Pass, id, Fname, Lname, age, salary, sa);
                        admin.updateEmp(oldID, w);
                        break;
                    case 20:
                        System.out.print("\nUpdate Course info ...!\nEnter Course OldID : ");
                        oldCID = input.next();
                        System.out.println("Enter Course Info ... ");
                        System.out.print("Course Name : ");
                        Cname = input.next();
                        System.out.print("Course Code : ");
                        Cid = input.next();
                        System.out.print("Max Grade : ");
                        maxGrade = input.nextInt();

                        Course c = new Course(Cname, Cid, maxGrade, cs);
                        admin.updateCourse(oldCID, c);
                        break;

                    case 21:
                        System.out.print("\nDelete Student info ...!\nEnter Student ID : ");
                        id = input.nextInt();
                        admin.deleteStudent(id);
                        break;

                    case 22:
                        System.out.print("\nDelete Prof info ...!\nEnter Prof ID : ");
                        id = input.nextInt();
                        admin.deleteProf(id);
                        break;

                    case 23:
                        System.out.print("\nDelete TA info ...!\nEnter TA ID : ");
                        id = input.nextInt();
                        admin.deleteTA(id);
                        break;

                    case 24:
                        System.out.print("\nDelete Emp info ...!\nEnter Emp ID : ");
                        id = input.nextInt();
                        admin.deleteEmp(id);
                        break;

                    case 25:
                        System.out.print("\nDelete Course info ...!\nEnter Course ID : ");
                        Cid = input.next();
                        admin.deleteCourse(Cid);
                        break;
                    default:
                        System.out.println("Enter vaild Option :(");

                }
            }
        }
    }

    public static void checkDirectoryContents(File dir){
        File[] files = dir.listFiles();
        boolean studentFile = true;
        boolean profFile = true;
        boolean TAFile = true;
        boolean EmpFile = true;
        boolean courseFile = true;

        for (File file : files) {

            if (file.getName().contains("Students.bin")) {
                studentFile = false;
            } else if (file.getName().contains("Professor.bin")) {
                profFile = false;
            } else if (file.getName().contains("TA.bin")) {
                TAFile = false;
            } else if (file.getName().contains("Employee.bin")) {
                EmpFile = false;
            } else if (file.getName().contains("Courses.bin")) {
                courseFile = false;
            }
        }
        if (studentFile) {
            Student x = new Student();
            x.commitToFile();
        } 
        
        if (profFile) {
            Professor x = new Professor();
            x.commitToFile();
        } 
        
        if (TAFile) {
            TeachingAssistant x = new TeachingAssistant();
            x.commitToFile();
        } 
        
        if (EmpFile) {
            studentAffairsEmp x = new studentAffairsEmp();
            x.commitToFile();
        } 
        
        if (courseFile) {
            Course x = new Course();
            x.commitToFile();
        }
    }

}
