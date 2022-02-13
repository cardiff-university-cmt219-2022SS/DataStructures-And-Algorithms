package cn.allwayz.Learning.Week3.exercise_b.Employee;

/**
 * @author allwayz
 * @create 2022-02-13 11:45
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee(67485, "Matt Morgan", "COMSC", "Lecturer");
        Employee employee2 = new Employee(78495, "Tim Marshall", "BIOSI", "Professor");
        Employee employee3 = new Employee(43637, "Richard Wright", "PHYSX", "Reader");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
