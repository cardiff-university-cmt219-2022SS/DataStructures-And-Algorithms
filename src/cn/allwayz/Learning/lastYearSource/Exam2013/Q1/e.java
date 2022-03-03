package cn.allwayz.Learning.lastYearSource.Exam2013.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 21:59
 */
public class e {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.run();
    }
}

class GeneralTest {

}

class TestThread extends GeneralTest implements Runnable {
    @Override
    public void run() {

    }
}
