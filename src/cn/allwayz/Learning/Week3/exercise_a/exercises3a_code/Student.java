package cn.allwayz.Learning.Week3.exercise_a.exercises3a_code;

public class Student {

    private static int nextAvailableNumber = 0;

    // Data members.
    private String forename;
    private String surname;
    private int number;
    private float averageMark;

    public Student(String inForename, String inSurname) {
        number = nextAvailableNumber++;
        forename = inForename;
        surname = inSurname;
    }

    public Student(String inSurname, float averageMark) {
        this.number = nextAvailableNumber++;
        this.surname = inSurname;
        this.averageMark = averageMark;
    }

    public void init(){

    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float inMark) {
        if (inMark >= 0 && inMark <= 100) {
            averageMark = inMark;
        } else {
            System.out.println("Error: average mark must be >=0 and <= 100.");
            System.out.println("average mark not modified.");
        }
    }

    @Override
    public String toString() {
        String s = surname + ", " + forename + " (" + number + ")";
        s += ": mean = " + averageMark;
        return s;
    }
}