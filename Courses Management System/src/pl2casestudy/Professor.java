package pl2casestudy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tamer A.Yassen
 */
public class Professor extends Staff implements Serializable {

    private String officeHours;

    private final String professorFileName = "Professor.bin";

    public static ArrayList<Professor> Professors = new ArrayList<Professor>();

    public Professor() {
    }

    public Professor(String user, String pass, int id, String fname, String lname, int age, double salary, String officeHours, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);

        this.officeHours = officeHours;
    }

    public void setOfficeHours(String h) {
        this.officeHours = h;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public boolean addProf() {
        loadFromFile();
        Professors.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(professorFileName, Professors);
    }

    public void loadFromFile() {
        Professors = (ArrayList<Professor>) FManger.read(professorFileName);
    }

    private int getProfIndex(int id) {
        for (int i = 0; i < Professors.size(); i++) {
            if (Professors.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllProfs() {
        loadFromFile();
        String S = "\nAll Professors Data:\n";
        for (Professor x : Professors) {
            S = S + x.toString();
        }
        return S;
    }

    public String searchProf(int id) {
        loadFromFile();
        int index = getProfIndex(id);
        if (index != -1) {
            return "\nFound ...!" + Professors.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }

    public boolean updateProf(int oldID, Professor x) {
        loadFromFile();
        int index = getProfIndex(oldID);

        if (index != -1) {
            Professors.set(index, x);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteProf(int id) {
        loadFromFile();
        int index = getProfIndex(id);

        if (index != -1) {
            Professors.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public String toString() {
        return "\nI'm Prof : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + officeHours + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    public void teach() {
        System.out.println("I'm Teaching all Lectures !");
    }
}
