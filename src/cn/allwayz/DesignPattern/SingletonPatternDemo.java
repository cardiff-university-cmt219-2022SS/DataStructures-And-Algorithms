package cn.allwayz.DesignPattern;

/**
 * @author allwayz
 * @create 2022-04-22 21:43
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        singletonPattern.showMessage();
    }
}
class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
