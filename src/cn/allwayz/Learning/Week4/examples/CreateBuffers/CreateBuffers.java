package cn.allwayz.Learning.Week4.examples.CreateBuffers;

public class CreateBuffers {
    public static void main(String[] args) {
        // Create a StringBuffer with a capacity of 16
        // characters
        StringBuffer buf1 = new StringBuffer();
        System.out.println("Number of characters = "
                + buf1.length());
        System.out.println("Space in buffer = "
                + buf1.capacity());
        System.out.println("Contents = " + "\""
                + buf1.toString() + "\"");

        // Create a StringBuffer with a capacity of 10
        // characters
        StringBuffer buf2 = new StringBuffer(10);
        System.out.println("Number of characters = "
                + buf2.length());
        System.out.println("Space in buffer = "
                + buf2.capacity());
        System.out.println("Contents = " + "\""
                + buf2.toString() + "\"");
        // Create a StringBuffer containing specified

        // String and an extra 16 unused characters.
        StringBuffer buf3 = new StringBuffer("cat");
        System.out.println("Number of characters = "
                + buf3.length());
        System.out.println("Space in buffer = "
                + buf3.capacity());
        System.out.println("Contents = " + "\""
                + buf3.toString() + "\"");
    }
}
