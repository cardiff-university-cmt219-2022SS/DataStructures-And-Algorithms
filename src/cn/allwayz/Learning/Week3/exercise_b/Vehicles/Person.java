package cn.allwayz.Learning.Week3.exercise_b.Vehicles;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * @author allwayz
 * @create 2022-02-13 11:55
 */
public class Person {
    private String name;
    private int age;
    private Calendar birthday;

    public Person() {
    }

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.age = 0;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday.getTime();
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getTime() +
                '}';
    }
}
