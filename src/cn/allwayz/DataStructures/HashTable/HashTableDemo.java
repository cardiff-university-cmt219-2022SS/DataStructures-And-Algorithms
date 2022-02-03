package cn.allwayz.DataStructures.HashTable;

import java.util.Hashtable;
import java.util.LinkedList;

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
        Hashtable hashtable = new Hashtable();
        Employee employee = new Employee(0,"allwayz");
        System.out.println();
    }
}

/**
 * 数组 + 链表实现
 */
class HashTable {

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

    }

    public void list() {

    }

    public void find(int id) {

    }

    public void delete(int id) {

    }
}









