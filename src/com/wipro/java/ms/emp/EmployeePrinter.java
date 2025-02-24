package com.wipro.java.ms.emp;

class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
