package vn.plusplus.javacore.lesson6.school;

public class Teacher extends Human implements LuongThang, LuongQuy, LuongNam{

    private String major;
    private int salary;

    public Teacher(int salary) {
        this.salary = salary;
    }

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

    @Override
    public double getMonthlySalary() {
        return 10;
    }

    @Override
    public double getYearIncome() {
        return 0;
    }

    @Override
    public double getQuaterSalary() {
        return 0;
    }

    public boolean checkDay(String currentDay){
        for(SchoolDay day : SchoolDay.values()){
            if(currentDay.equals(day.name())){
                return false;
            }
        }
        return true;
    }
}
