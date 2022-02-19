package cn.allwayz.Learning.Week4.exercise;

import java.util.*;

/**
 * @author allwayz
 * @create 2022-02-19 03:46
 */
public class GenericsAndCollections {
    public static void main(String[] args) {
        // List Interface
        List arrayList = new ArrayList<>();
        List vector = new Vector();
        List linkedList = new LinkedList();

        // Set Interface
        Set hashSet = new HashSet();

        // Map Interface
        Map<String, String> map = new HashMap<>(8);

        // Enhanced For Loop
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        for (Object object : arrayList) {
            System.out.println(object);
        }
    }

    public static void IteratorTest(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
