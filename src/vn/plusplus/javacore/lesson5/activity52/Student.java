package vn.plusplus.javacore.lesson5.activity52;

public class Student {
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean checkGPA(){
        if(gpa >= 1.5){
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(){
        System.out.println("Student: " + name + " has gpa:" + gpa);
    }
}
