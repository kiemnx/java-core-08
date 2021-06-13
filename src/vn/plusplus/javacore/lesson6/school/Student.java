package vn.plusplus.javacore.lesson6.school;

public class Student extends Human{

    private float gpa;
    private String className;

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void showInfo(){
        System.out.println("Student name: " + this.getName());
    }

    public void print(){
        showInfo();
//        super.showInfo();
    }
}
