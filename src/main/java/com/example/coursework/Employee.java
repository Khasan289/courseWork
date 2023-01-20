package com.example.coursework;

public class Employee {
    private final String fullName;
    private String department;
    private int salary;
    private int id;
    public static int count;

    public Employee(String fullName,String department,int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Ф.И.О.-" + fullName + ", "
                + department + ", " +
                "Заработная плата " + salary + " рублей в месяц"
                + ", id сотрудника-" + id;
    }
}
