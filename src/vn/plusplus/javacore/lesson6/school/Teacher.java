package vn.plusplus.javacore.lesson6.school;

public class Teacher extends Human{

    private String major;
    private int salary;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
