package pl2casestudy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tamer A.Yassen
 */
public class Course implements Serializable {

    private String CName, CId;
    private int CreditHours;

    FileMangerBinary FManger = new FileMangerBinary();
    private final String CourseFileName = "Courses.bin";

    Department dept;
    Exam finalExame;

    public static ArrayList<Course> Courses = new ArrayList<Course>();

    public Course() {
    }

    public Course(String Cname, String CId, int CreditHours, Department dept) {
        this.CName = Cname;
        this.CId = CId;
        this.CreditHours = CreditHours;

        this.dept = dept;

        finalExame = new Exam(Cname + " Final Exam", CId + " 01", 100);
        System.out.println("\n" + finalExame.toString() + "Added Successfully ... !");
        finalExame.addExam();
    }

    public void setCId(String Id) {
        this.CId = Id;
    }

    public void setCname(String name) {
        this.CName = name;
    }

    public void setCreditHours(int CreditHours) {
        this.CreditHours = CreditHours;
    }

    public String getCId() {
        return this.CId;
    }

    public String getCname() {
        return this.CName;
    }

    public int getCreditHours() {
        return this.CreditHours;
    }

    public boolean addCourse() {
        loadFromFile();
        Courses.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(CourseFileName, Courses);
    }

    public void loadFromFile() {
        Courses = (ArrayList<Course>) FManger.read(CourseFileName);
    }

    private int getCourseIndex(String id) {
        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllCourses() {
        loadFromFile();
        String S = "\nAll Courses Data:\n";
        for (Course x : Courses) {
            S = S + x.toString();
        }
        return S;
    }

    public String searchCourse(String id) {
        loadFromFile();
        int index = getCourseIndex(id);
        if (index != -1) {
            return "\nFound ...!" + Courses.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }

    public boolean updateCourse(String oldID, Course x) {
        loadFromFile();
        int index = getCourseIndex(oldID);

        if (index != -1) {
            Courses.set(index, x);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteCourse(String id) {
        loadFromFile();
        int index = getCourseIndex(id);

        if (index != -1) {
            Courses.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public String toString() {
        return "\nCourse Name : " + CName + "\t" + "Course ID : " + CId + "\n" + "Course Credit Hours : " + CreditHours + "\n";
    }
}
