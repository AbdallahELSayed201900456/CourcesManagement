package pl2casestudy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tamer A.Yassen
 */
public class studentAffairsEmp extends Staff implements Serializable {

    private final String EmpFileName = "Employee.bin";

    public static ArrayList<studentAffairsEmp> Employees = new ArrayList<studentAffairsEmp>();

    public studentAffairsEmp() {
    }

    public studentAffairsEmp(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    public boolean addEmp() {
        loadFromFile();
        Employees.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(EmpFileName, Employees);
    }

    public void loadFromFile() {
        Employees = (ArrayList<studentAffairsEmp>) FManger.read(EmpFileName);
    }

    private int getEmpIndex(int id) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllEmp() {
        loadFromFile();
        String S = "\nAll Employees Data:\n";
        for (studentAffairsEmp x : Employees) {
            S = S + x.toString();
        }
        return S;
    }

    public String searchEmp(int id) {
        loadFromFile();
        int index = getEmpIndex(id);
        if (index != -1) {
            return "\nFound ...!" + Employees.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }

    public boolean updateEmp(int oldID, studentAffairsEmp x) {
        loadFromFile();
        int index = getEmpIndex(oldID);

        if (index != -1) {
            Employees.set(index, x);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteEmp(int id) {
        loadFromFile();
        int index = getEmpIndex(id);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public String toString() {
        return "\nI'm Student Affairs Emp : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

}
