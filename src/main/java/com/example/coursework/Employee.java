package com.example.coursework;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private int id;
    public static int count;

    public Employee(String fullName,int department,int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = this.salary +(this.salary/ 100) * salary;
    }

    @Override
    public String toString() {

        return "Ф.И.О.-" + fullName + ", Отдел № "
                + department + ", " +
                "Заработная плата " + salary + " рублей в месяц"
                + ", id сотрудника-" + id;
    }
}
