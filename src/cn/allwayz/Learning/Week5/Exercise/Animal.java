package cn.allwayz.Learning.Week5.Exercise;

/**
 * @author allwayz
 * @create 2022-03-09 17:50
 */
public class Animal {
    private String name;
    private String category;

    public Animal(){

    }

    public Animal(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
