package cn.allwayz.Learning.Week3.exercise_b.Vehicles;

import java.util.Calendar;
import java.util.Date;

/**
 * @author allwayz
 * @create 2022-02-13 11:49
 */
public class VehicleDemo {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        c1.set(1999, 3 - 1, 12);

        Vehicle truck = new Truck();
        truck.setCylinder(6);
        truck.setOwner(new Person());
        truck.setName("Land cruiser");
        truck.getOwner().setAge(18);
        truck.getOwner().setBirthday(c1);
        truck.getOwner().setName("Jack");
        System.out.println(truck);

    }
}
