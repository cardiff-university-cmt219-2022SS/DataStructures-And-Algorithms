package cn.allwayz.DataStructures.HashTable;

import java.util.Scanner;

/**
 * Google面试题：一个公司有新员工来报道时，要求将该员工的信息(id, gender, age, address)加入，当输入该员工的id时，要求查找到该员工的所有信息。<br>
 * 要求不使用数据库，尽量节省内存，速度越快越好
 *
 * @author allwayz
 * @create 2022-02-03 00:24
 */
public class HashTableDemo {
    /**
     * 散列表时根据关键码值而直接进行访问的数据结构。也就是说，它通过把关键码值映射到表中的一个位置来访问记录，以加快查找速度<br>
     * 这个映射函数叫做散列函数，存放记录的数组叫做散列表<br>
     *
     * @param args
     */
    public static void main(String[] args) {
        HashTable hashtable = new HashTable(8);

        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=============================");
            System.out.println("add: Add Employee");
            System.out.println("list: Show Hashtable");
            System.out.println("find: Find Node");
            System.out.println("exit: Exit Application");

            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("Enter ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter Name");
                    String name = scanner.next();
                    Employee employee = new Employee(id, name);
                    hashtable.add(employee);
                    break;
                case "list":
                    hashtable.list();
                    break;
                case "find":
                    id = scanner.nextInt();
                    if (hashtable.find(id) == null){
                        System.out.println("Node not found");
                    }else {
                        System.out.println(hashtable.find(id));
                    }
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }

    }
}

/**
 * 数组 + 链表实现<br>
 * 管理多条链表
 */
class HashTable {
    private EmployeeLinkedList[] employeeLinkedLists;
    private int size;

    public HashTable(int size) {
        this.size = size;
        employeeLinkedLists = new EmployeeLinkedList[size];
        // 初始化每个链表
        for (int i = 0; i < size; i++) {
            employeeLinkedLists[i] = new EmployeeLinkedList();
        }
    }

    public void add(Employee employee) {
        // 根据员工的ID得到该员工应该添加到哪一条链表
        employeeLinkedLists[hash(employee.id)].add(employee);
    }

    public void list() {
        for (int i = 0; i < size; i++) {
            employeeLinkedLists[i].list(i);
        }
    }

    public Employee find(int id) {
        return employeeLinkedLists[hash(id)].find(id);
    }

    public int hash(int id) {
        return id % size;
    }

}

class Employee {
    public int id;
    public String name;
    public Employee next;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node:[id=" + id + ",gender=" + name + "]";
    }
}

/**
 * add(Employee)<br>
 * list()<br>
 * find(int id)<br>
 * delete(int id)<br>
 */
class EmployeeLinkedList {
    private Employee head;

    public void add(Employee employee) {
        if (head == null) {
            head = employee;
            return;
        }
        Employee temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = employee;
    }

    public void list(int i) {
        if (head == null) {
            System.out.println("No " + i + " LinkedList is Empty.");
            return;
        }
        Employee temp = head;
        System.out.print("No "+i+": ");
        while (temp != null) {
            System.out.print(" => "+temp);
            temp = temp.next;
        }
        System.out.println();
    }

    public Employee find(int id) {
        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return null;
        }
        Employee temp = head;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void delete(int id) {

    }
}









