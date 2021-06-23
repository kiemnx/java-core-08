package vn.plusplus.javacore.lesson6.school;

public class Officer extends Human implements LuongThang, LuongQuy, LuongNam{
    private String role;
    private int salary;

    public Officer(int salary) {
        this.salary = salary;
    }

    @Override
    public double getMonthlySalary() {
        return 1000;
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
