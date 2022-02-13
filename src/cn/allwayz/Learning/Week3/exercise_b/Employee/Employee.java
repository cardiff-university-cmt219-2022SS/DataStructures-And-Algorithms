package cn.allwayz.Learning.Week3.exercise_b.Employee;

/**
 * TODO:Finish Exercise3_b
 *
 * @author Allwayz
 */
public class Employee {
    private int idNumber;
    private String name;
    private String department;
    private String position;

    public Employee(int idNumber, String name, String department, String position) {
        this.idNumber = idNumber;
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public Employee(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
        this.department = "";
        this.position = "";
    }

    public Employee() {

    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
