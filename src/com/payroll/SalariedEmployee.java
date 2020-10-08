package com.payroll;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary/12;
    }
}
