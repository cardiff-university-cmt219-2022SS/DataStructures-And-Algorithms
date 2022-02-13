package cn.allwayz.Learning.Week3.exercise_b.Vehicles;

/**
 * @author allwayz
 * @create 2022-02-13 11:51
 */
public class Vehicle {
    private String name;
    private int cylinder;
    private Person owner;

    public Vehicle() {
    }

    public Vehicle(String name, int cylinder, Person owner) {
        this.name = name;
        this.cylinder = cylinder;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", cylinder=" + cylinder +
                ", owner=" + owner +
                '}';
    }
}
