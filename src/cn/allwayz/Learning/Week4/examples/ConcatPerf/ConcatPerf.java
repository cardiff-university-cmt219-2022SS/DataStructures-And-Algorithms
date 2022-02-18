package cn.allwayz.Learning.Week4.examples.ConcatPerf;
// Performance comparison of concatenation of strings
// of numbers from 1 to 100000

public class ConcatPerf {
    private static final int ITERATIONS = 100000;
    private static final int BUFFSIZE = 16;

    // using String directly
    private void concatStrAdd() {
        System.out.print("concatStrAdd   -> ");
        // System.currentTimeMillis() returns the current time in milliseconds
        long startTime = System.currentTimeMillis();
        String concat = "";
        for (int i = 0; i < ITERATIONS; i++) {
            concat = concat + (i % 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime));
    }

    // Using StringBuffer
    private void concatStrBuff() {
        System.out.print("concatStrBuff  -> ");
        long startTime = System.currentTimeMillis();
        StringBuffer concat = new StringBuffer(BUFFSIZE);
        for (int i = 0; i < ITERATIONS; i++) {
            concat.append(i % 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime));
    }

    // Using StringBuilder
    private void concatStrBuild() {
        System.out.print("concatStrBuild -> ");
        long startTime = System.currentTimeMillis();
        StringBuilder concat = new StringBuilder(BUFFSIZE);
        for (int i = 0; i < ITERATIONS; i++) {
            concat.append(i % 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime));
    }

    public static void main(String[] args) {
        ConcatPerf st = new ConcatPerf();
        System.out.println("Iterations: " + ITERATIONS);
        System.out.println("Buffer    : " + BUFFSIZE);

        st.concatStrBuff();
        st.concatStrBuild();
        st.concatStrAdd();
    }
}  
