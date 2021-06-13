package vn.plusplus.javacore.lesson6.school;

public class Employee extends Officer{
    private int salary;
    private String position;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
