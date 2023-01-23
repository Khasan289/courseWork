package com.example.coursework;

public class Main {
    static Employee[] employees = new Employee[10];



    public static void printEmployees() {
        // Метод для вывода в консоль всех данных сотрудников

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }

    public static void calculateSalarySum() {
        // Метод для подсчета суммы затрат на ЗП

        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты, составляет " + sum + " рублей");
        System.out.println();
    }

    public static void determineMinSalary() {
        // Метод для определения минимальной ЗП

        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет " + min);
        System.out.println();
    }

    public static void determineMaxSalary() {
        // Метод для определиня максимальной ЗП

        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " + max);
        System.out.println();
    }

    public static void determineAverageSalary() {
        // Метод для определиня средней ЗП

        int sum = 0;
        int numberEmployees = 0;
        for (Employee employee:employees) {
            if (employee != null) {
                sum += employee.getSalary();
                numberEmployees += 1;
            }
        }
        double averageSalary = sum / numberEmployees;
        System.out.println( "Средняя зарплата составляет " + averageSalary);
        System.out.println();
    }

    public static void printFullName() {
        // Метод для печати Ф.И.О. сотрудников

        for (Employee employee:employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }

    }

    public static void changeSalaryAllEmployees( int salaryIndexation) {
        for (Employee employee:employees) {
            if (employee != null) {
                employee.setSalary(salaryIndexation);
            }

        }
    }

    public static void determineMinSalaryForDepartment(int department) {

        int min =Integer.MAX_VALUE;
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() != department) {
                continue;
            }
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника в отделе № " + department + ", " + min + " рублей");
        System.out.println();
    }
    public static void determineMaxSalaryForDepartment(int department) {


        int max = Integer.MIN_VALUE;

        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() != department) {
                continue;
            }
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника в отделе № " + department + ", " + max + " рублей");
        System.out.println();

    }

    public static void calculateSumSalaryForDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee!= null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в отделе № " + department + ", составляет " + sum + " рублей");
        System.out.println();
    }

    public static void determineAverageSalaryForDepartment(int department) {
        int sum = 0;
        int numberEmployees = 0;
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment()==department) {
                sum += employee.getSalary();
                numberEmployees += 1;
            }
        }
        double averageSalary = sum / numberEmployees;
        System.out.println("Средняя зарплата в отделе № " + department + ", " + averageSalary + " рублей");
        System.out.println();
    }

    public static void changeSalaryAllEmployeesForDepartment(int department, int percent) {
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(percent);
            }

        }
    }
    public static void printEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", зарплата " + employee.getSalary() + " рублей " + ", id: " + employee.getId());
            }
        }
    }

    public static void determineSalaryLessNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", зарплата " + employee.getSalary() + " рублей");
            }
        }
    }
    public static void determineSalaryGreaterNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", зарплата " + employee.getSalary() + " рублей");
            }
        }
    }



    public static void main (String[]args){



        Employee petrov = new Employee("Петров Василий Николаевич", 1, 90_000);
        Employee sidorov = new Employee("Сидоров Семён Сергеевич", 2, 1_000);
        Employee ivanov = new Employee("Иванов Иван Иванович", 3, 3_000);
        Employee deputat = new Employee("Тунеядов Стул Протераевич", 4, 82_000);
        Employee zaycev = new Employee("Зайцев Евгений Романович", 1, 4_000);
        Employee romanov = new Employee("Романов Константин Михайлович", 3, 5_000);
        Employee kantemirov = new Employee("Кантемиров Руслан Харитонович", 1, 6_000);
        Employee kozyrev = new Employee("Козырев Алан Русланович", 3, 10_000);



        employees[0] = petrov;
        employees[1] = sidorov;
        employees[2] = ivanov;
        employees[3] = deputat;
        employees[4] = zaycev;
        employees[5] = romanov;
        employees[6] = kantemirov;
        employees[7] = kozyrev;

        changeSalaryAllEmployees(10);

        determineMinSalaryForDepartment(1);
        determineMaxSalaryForDepartment(3);
        calculateSumSalaryForDepartment(3);
        determineAverageSalaryForDepartment(3);
        changeSalaryAllEmployeesForDepartment(3,30);
        printEmployeesDepartment(3);


        determineSalaryLessNumber(1500);
        determineSalaryGreaterNumber(80_000);



    }


    }



