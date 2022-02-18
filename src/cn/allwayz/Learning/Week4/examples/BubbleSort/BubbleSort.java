package cn.allwayz.Learning.Week4.examples.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int marks[] = {23, 17, 59, 86, 10};
        System.out.println("Unsorted Array");
        System.out.println("--------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // sort array
        bubble(marks);
        System.out.println("Sorted Array");
        System.out.println("------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    // method to sort an array using a bubble sort
    public static void bubble(int[] marks) {
        int i, j, temp;
        for (i = 0; i < marks.length - 1; i++) {
            for (j = marks.length - 1; j > i; j--) {
                if (marks[j] < marks[j - 1]) {
                    temp = marks[j];
                    marks[j] = marks[j - 1];
                    marks[j - 1] = temp;
                }
            }
        }
    }
}
