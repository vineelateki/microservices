package com.wipro.java.ms.emp;

class EmployeePersistence {
    public void saveToFile(Employee employee, String fileName) {
        System.out.println("Saving employee " + employee.getName() + " to file: " + fileName);
    }
}
