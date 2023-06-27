package pl2casestudy;

/**
 *
 * @author Tamer A.Yassen
 */
public class Admin extends Staff {

    public Admin() {

    }

    public Admin(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    public void addNewStudent(String user, String pass, int id, String fname, String lname, int age, int level, double GPA, Department dept) {
        Student x = new Student(user, pass, id, fname, lname, age, level, GPA, dept);
        if (x.addStudent()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayStudents() {
        Student x = new Student();
        System.out.println(x.displayAllStudents());
    }

    public void searchForStudent(int id) {
        Student x = new Student();
        System.out.println(x.searchStudent(id));
    }

    public void updateStudent(int oldID, Student newStudentValues) {
        Student x = new Student();
        if (x.updateStudent(oldID, newStudentValues)) {
            System.out.println(newStudentValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteStudent(int Id) {
        Student x = new Student();
        if (x.deleteStudent(Id)) {
           System.out.println("Student: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }

    public void addNewProf(String user, String pass, int id, String fname, String lname, int age, double salary, String officeHours, Department dept) {
        Professor x = new Professor(user, pass, id, fname, lname, age, salary, officeHours, dept);
        if (x.addProf()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayProfs() {
        Professor x = new Professor();
        System.out.println(x.displayAllProfs());
    }

    public void searchForProf(int id) {
        Professor x = new Professor();
        System.out.println(x.searchProf(id));
    }

    public void updateProf(int oldID, Professor newProfValues) {
        Professor x = new Professor();
        if (x.updateProf(oldID, newProfValues)) {
            System.out.println(newProfValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteProf(int Id) {
        Professor x = new Professor();
        if (x.deleteProf(Id)) {
            System.out.println("Prof: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }

    public void addNewTA(String user, String pass, int id, String fname, String lname, int age, double salary, String academicHours, Department dept) {
        TeachingAssistant x = new TeachingAssistant(user, pass, id, fname, lname, age, salary, academicHours, dept);
        if (x.addTA()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayTAs() {
        TeachingAssistant x = new TeachingAssistant();
        System.out.println(x.displayAllTAs());
    }

    public void searchForTA(int id) {
        TeachingAssistant x = new TeachingAssistant();
        System.out.println(x.searchTA(id));
    }

    public void updateTA(int oldID, TeachingAssistant newTAValues) {
        TeachingAssistant x = new TeachingAssistant();
        if (x.updateTA(oldID, newTAValues)) {
            System.out.println(newTAValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }

    }

    public void deleteTA(int Id) {
        TeachingAssistant x = new TeachingAssistant();
        if (x.deleteTA(Id)) {
            System.out.println("TA: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }

    public void addNewEmp(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        studentAffairsEmp x = new studentAffairsEmp(user, pass, id, fname, lname, age, salary, dept);
        if (x.addEmp()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayEmployees() {
        studentAffairsEmp x = new studentAffairsEmp();
        System.out.println(x.displayAllEmp());
    }

    public void searchForEmp(int id) {
        studentAffairsEmp x = new studentAffairsEmp();
        System.out.println(x.searchEmp(id));
    }

    public void updateEmp(int oldID, studentAffairsEmp newEmpValues) {
        studentAffairsEmp x = new studentAffairsEmp();
        if (x.updateEmp(oldID, newEmpValues)) {
            System.out.println(newEmpValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteEmp(int Id) {
        studentAffairsEmp x = new studentAffairsEmp();
        if (x.deleteEmp(Id)) {
            System.out.println("Emp: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }

    public void addNewCourse(String Cname, String CId, int CreditHours) {
        Course x = new Course(Cname, CId, CreditHours, Main.cs);
        if (x.addCourse()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

    public void displayCourses() {
        Course x = new Course();
        System.out.println(x.displayAllCourses());
    }

    public void searchForCourse(String id) {
        Course x = new Course();
        System.out.println(x.searchCourse(id));
    }

    public void updateCourse(String oldID, Course newCourseValues) {
        Course x = new Course();
        if (x.updateCourse(oldID, newCourseValues)) {
            System.out.println(newCourseValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }

    }

    public void deleteCourse(String Id) {
        Course x = new Course();
        if (x.deleteCourse(Id)) {
            System.out.println("Course: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }

    @Override
    public String toString() {
        return "I'm Manager : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

}
