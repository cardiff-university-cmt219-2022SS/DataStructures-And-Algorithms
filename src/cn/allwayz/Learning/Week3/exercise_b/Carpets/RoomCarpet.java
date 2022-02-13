package cn.allwayz.Learning.Week3.exercise_b.Carpets;

/**
 * @author allwayz
 * @create 2022-02-13 13:11
 */
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension roomDimension, double price) {
        this.size = roomDimension;
        this.carpetCost = price;
    }

    public double getTotalCost(){
        return this.size.getArea()* carpetCost;
    }

    @Override
    public String toString() {
        return "RoomCarpet{" +
                "roomDimension=" + size +
                ", price=" + carpetCost +
                '}';
    }
}
