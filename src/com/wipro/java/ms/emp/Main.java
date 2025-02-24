package com.wipro.java.ms.emp;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50000);
        
        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(emp);

        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToFile(emp, "employee_data.txt");
    }
}
