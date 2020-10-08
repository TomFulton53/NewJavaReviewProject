package com.payroll;

public abstract class Employee {
    private int employeeId;
    private String name;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {return name;}

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
        else{
            this.name = "";
        }
    }

    public int getEmployeeId() {return employeeId; }

    public abstract double calculatePay();
}
