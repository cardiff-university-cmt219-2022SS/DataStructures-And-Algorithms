package cn.allwayz.Learning.Week3.exercise_b.Vehicles;

import java.util.Objects;

/**
 * @author allwayz
 * @create 2022-02-13 11:58
 */
public class Truck extends Vehicle {
    private double loadCapacity;
    private int towingCapacity;

    public Truck() {
    }

    public Truck(double loadCapacity, int towingCapacity) {
        super();
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Vehicle{\n" +
                "\tname = '" + super.getName() + "'\n" +
                "\tcylinder = " + super.getCylinder() + "\n" +
                "\towner = " + super.getOwner() + "\n" +
                "\tType = {\n" +
                "\t\tloadCapacity = " + loadCapacity + "\n" +
                "\t\ttowingCapacity = " + towingCapacity + "\n" +
                "\t}\n" +
                "}\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Truck)) {
            return false;
        }
        Truck truck = (Truck) o;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 && towingCapacity == truck.towingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity, towingCapacity);
    }
}
