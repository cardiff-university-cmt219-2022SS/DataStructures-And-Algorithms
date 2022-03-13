package cn.allwayz.Learning.Week5.Exercise;

/**
 * @author allwayz
 * @create 2022-03-09 17:51
 */
public class Cat extends Animal{
    private int height;
    private int head;

    public Cat() {
        super();
    }

    public Cat(String name, String category, int height, int head) {
        super(name, category);
        this.height = height;
        this.head = head;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    @Override
    public String toString() {
        super.toString();
        return "Cat{" +
                "name="+super.getName()+
                ", category="+super.getCategory()+
                ", height=" + height +
                ", head=" + head +
                '}';
    }
}
