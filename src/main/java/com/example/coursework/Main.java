package com.example.coursework;

public class Main {
    public static void printEmployees(Employee[] arrayEmployees) {
        // Метод для вывода в консоль всех данных сотрудников

        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null) {
                System.out.println(arrayEmployees[i]);
            }
        }
        System.out.println();
    }

    public static void calculateSalarySum(Employee[] arrayEmployees) {
        // Метод для подсчета суммы затрат на ЗП

        int sum = 0;
        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null) {
                sum += arrayEmployees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты, составляет " + sum + " рублей");
        System.out.println();
    }

    public static void determineMinimumSalary(Employee[]arrayEmployees) {
        // Метод для определения минимальной ЗП

        int min = arrayEmployees[0].getSalary();
        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null && arrayEmployees[i].getSalary() < min) {
                min = arrayEmployees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет " + min);
        System.out.println();
    }

    public static void determineMaxSalary(Employee[] arrayEmployees) {
        // Метод для определиня максимальной ЗП

        int max = arrayEmployees[0].getSalary();
        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null && arrayEmployees[i].getSalary() > max) {
                max = arrayEmployees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " + max);
        System.out.println();
    }

    public static void determineAverageSalary(Employee[] arrayEmployees) {
        // Метод для определиня средней ЗП

        int sum = 0;
        int numberEmployees = 0;
        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null) {
                sum += arrayEmployees[i].getSalary();
                numberEmployees += 1;
            }
        }
        double averageSalary = sum / numberEmployees;
        System.out.println( "Средняя зарплата составляет " + averageSalary);
        System.out.println();
    }

    public static void printFullName(Employee[] arrayEmployees) {
        // Метод для печати Ф.И.О. сотрудников

        for (int i = 0; i < arrayEmployees.length - 1; i++) {
            if (arrayEmployees[i] != null) {
                System.out.println(arrayEmployees[i].getFullName());
            }
        }

    }


    public static void main (String[]args){

        Employee[] employees = new Employee[10];

        Employee petrov = new Employee("Петров Василий Николаевич", "Отдел № 1", 9_0000);
        Employee sidorov = new Employee("Сидоров Семён Сергеевич", "Отдел № 2", 1_000);
        Employee ivanov = new Employee("Иванов Иван Иванович", "Отдел № 3", 3_000);
        Employee deputat = new Employee("Тунеядов Стул Протераевич", "Отдел № 4", 82_000);

        sidorov.setSalary(20_000);

        employees[0] = petrov;
        employees[1] = sidorov;
        employees[2] = ivanov;
        employees[3] = deputat;

        printEmployees(employees);
        calculateSalarySum(employees);
        determineMinimumSalary(employees);
        determineMaxSalary(employees);
        determineAverageSalary(employees);
        printFullName(employees);
        }


    }



