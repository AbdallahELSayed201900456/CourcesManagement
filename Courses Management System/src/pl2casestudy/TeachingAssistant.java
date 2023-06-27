package pl2casestudy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tamer A.Yassen
 */
public class TeachingAssistant extends Staff implements Serializable {

    private String academicHours;

    private final String TAFileName = "TA.bin";

    public static ArrayList<TeachingAssistant> TAs = new ArrayList<TeachingAssistant>();

    public TeachingAssistant() {
    }

    public TeachingAssistant(String user, String pass, int id, String fname, String lname, int age, double salary, String academicHours, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
        this.academicHours = academicHours;
    }

    public void setacademicHours(String h) {
        this.academicHours = h;
    }

    public String getacademicHours() {
        return this.academicHours;
    }

    public boolean addTA() {
        loadFromFile();
        TAs.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(TAFileName, TAs);
    }

    public void loadFromFile() {
        TAs = (ArrayList<TeachingAssistant>) FManger.read(TAFileName);
    }

    private int getTAIndex(int id) {
        for (int i = 0; i < TAs.size(); i++) {
            if (TAs.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllTAs() {
        loadFromFile();
        String S = "\nAll TAs Data:\n";
        for (TeachingAssistant x : TAs) {
            S = S + x.toString();
        }
        return S;
    }

    public String searchTA(int id) {
        loadFromFile();
        int index = getTAIndex(id);
        if (index != -1) {
            return "\nFound ...!" + TAs.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }

    public boolean updateTA(int oldID, TeachingAssistant x) {
        loadFromFile();
        int index = getTAIndex(oldID);

        if (index != -1) {
            TAs.set(index, x);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteTA(int id) {
        loadFromFile();
        int index = getTAIndex(id);

        if (index != -1) {
            TAs.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public String toString() {
        return "\nI'm Teaching Assistant : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    public void teach() {
        System.out.println("I'm Teaching all Sections!");
    }

    public void study() {
        System.out.println("I'm Studying Postgraduate Courses @ FCIH :) ");
    }

}
