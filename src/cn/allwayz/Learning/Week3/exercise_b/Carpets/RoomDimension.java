package cn.allwayz.Learning.Week3.exercise_b.Carpets;

/**
 * @author allwayz
 * @create 2022-02-13 13:10
 */
public class RoomDimension {
    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "RoomDimension{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
