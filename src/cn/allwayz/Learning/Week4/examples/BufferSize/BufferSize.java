package cn.allwayz.Learning.Week4.examples.BufferSize;

public class BufferSize {
    public static void main(String[] args) {
        // Create a StringBuffer containing specified String and an
        // extra 16 unused characters.
        StringBuffer buffer = new StringBuffer("Mike Evans");
        char[] surName = new char[buffer.length()];
        System.out.println("Number of characters in buffer = "
                + buffer.length());
        System.out.println("Space in buffer = "
                + buffer.capacity());
        System.out.println("Contents of buffer = " + "\""
                + buffer.toString() + "\"");
        buffer.getChars(5, 10, surName, 0);
        System.out.println("Contents of character array is "
                + "\"" + String.valueOf(surName) + "\"");
        buffer.setLength(4);
        System.out.println("Number of characters in buffer = "
                + buffer.length());
        System.out.println("Space in buffer = "
                + buffer.capacity());
        System.out.println("Contents of buffer = " + "\""
                + buffer.toString() + "\"");
        // Minimum capacity of StringBuffer is set to the greater of
        // (1)	the minimumCapacity argument
        // (2)	twice the old capacity plus 2
        buffer.ensureCapacity(27);
        System.out.println("Space in buffer = "
                + buffer.capacity());
        buffer.ensureCapacity(150);
        System.out.println("Space in buffer = "
                + buffer.capacity());
    }
}
