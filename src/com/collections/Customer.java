package com.collections;

public class Customer {
    private String name;
    private int custNumber;
    private float balance;

    public Customer(String name, int custNumber, float balance) {
        this.name = name;
        this.custNumber = custNumber;
        this.balance = balance;
    }

    public int getCustNumber() {
        return custNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", custNumber=" + custNumber +
                ", balance=" + balance +
                '}';
    }
}
