package vn.plusplus.javacore.lesson6.school;

public class Employee extends Human implements LuongThang, LuongQuy, LuongNam{
    private int salary;
    private String position;

    public Employee(int salary) {
        this.salary = salary;
    }

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

    @Override
    public double getMonthlySalary() {
        return 0;
    }

    @Override
    public double getYearIncome() {
        return 0;
    }

    @Override
    public double getQuaterSalary() {
        return 0;
    }
}
